class Tiger extends Piece {
    private String symbol;

    private int strength;
    private int team;
    private Location loc;
    private Object[] store = new Object[1];

    Tiger() {
        this.symbol = "t";
        this.loc = getLocation();

    }

    public String toString() {
        return this.symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    //for tiger and lion
    public boolean checkWater(Location loc){
        if(board[loc.posX][loc.posY + 1] == "w" || board[loc.posX][loc.posY-1] == "w")
            return true;
        else if(board[loc.posX + 1][loc.posY] == "w" || board[loc.posX - 1][loc.posY] == "w" ){
            return true;
        }
        return false;
    }

    public void setSymbol(String letter) {
        this.symbol = letter;
    }

    public boolean move(Location to,Object[][] board) {

        boolean flag;
        Piece temp = null;
        int convertCheck = 0;
        if (board[to.posX][to.posY].getClass() != String.class) {
            temp = (Piece) board[to.posX][to.posY];
            convertCheck = 1;
        }
        if (board[to.posX][to.posY].equals("w"))         //water
        {
            Object swap = board[loc.posX][loc.posY];
            board[loc.posX][loc.posY] = board[to.posX][to.posY];
            board[to.posX][to.posY] = swap;
            Piece p = (Piece) board[to.posX][to.posY];
            p.setLocation(to.posX, to.posY);
        } else if (to.posX == loc.posX && Math.abs(to.posY - loc.posY) == 1)  // moving horizontally
        {
            if (convertCheck == 1 && this.getTeam() == temp.getTeam() && temp.getClass() != Trap.class) {
                return false;
            } //same piece
            else if (convertCheck == 1 && temp.getTeam() != this.getTeam() && temp.getClass() != Trap.class) {
                flag = capture(temp, board);
                return flag;
            } else if (convertCheck == 1 && temp.getClass() == Trap.class) {
                if (this.getTeam() != temp.getTeam()) {
                    this.setStrength(0);
                }
                temp.setLocation(loc.posX, loc.posY);
                store[0] = temp;

            } else if (store[0] != null) {
                Object swap = board[loc.posX][loc.posY];
                board[loc.posX][loc.posY] = store[0];
                store[0] = null;
                board[to.posX][to.posY] = swap;
                Piece p = (Piece) board[to.posX][to.posY];
                p.setLocation(to.posX, to.posY);
                //System.out.println(p.store[0]);
            }

            Object swap = board[loc.posX][loc.posY];
            board[loc.posX][loc.posY] = "0";
            board[to.posX][to.posY] = swap;
            Piece p = (Piece) board[to.posX][to.posY];
            p.setLocation(to.posX, to.posY);
        } else if (to.posY == loc.posY && Math.abs(to.posX - loc.posX) == 1)  //moving vertically
        {
            if (!checkWater(loc)) {
                if(convertCheck==1 && this.getTeam()==temp.getTeam()&&temp.getClass()!=Trap.class)
                { return false; } //same piece
                if(convertCheck==1 && temp.getTeam()!=this.getTeam()&&temp.getClass()!=Trap.class)
                {
                    flag=capture(temp,board);
                    return flag;
                }else if(convertCheck==1&& temp.getClass()==Trap.class)
                {
                    if(this.getTeam()!=temp.getTeam())
                    {
                        this.setStrength(0);
                    }
                    temp.setLocation(loc.posX,loc.posY);
                    store[0]=temp;

                }else if(store[0]!=null)
                {
                    Object swap = board[loc.posX][loc.posY];
                    board[loc.posX][loc.posY] = store[0];
                    store[0]=null;
                    board[to.posX][to.posY] = swap;
                    Piece p = (Piece) board[to.posX][to.posY];
                    p.setLocation(to.posX, to.posY);
                }
                Object swap = board[loc.posX][loc.posY];
                board[loc.posX][loc.posY] = "0";
                board[to.posX][to.posY] = swap;
                Piece p = (Piece) board[to.posX][to.posY];
                p.setLocation(to.posX, to.posY);
                }
            }
            /*else if(checkWater()){

            }*/
            else {
                    System.out.println("Invalid move");
                    return false;
            }

            return true;
        }
    }