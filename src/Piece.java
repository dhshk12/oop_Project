
class Piece extends Game {

    static class Location
    {
        int posX;
        int posY;

        Location(){}
    }

    private Location loc;
    private int strength ;
    private int team;
    private String symbol;



    public boolean move(Location to,Object[][] board)
    {
        boolean flag;
        Piece temp=null;
        int convertCheck=0;

        if(board[to.posX][to.posY].getClass()!=String.class)
        {
            temp=(Piece)board[to.posX][to.posY];
            convertCheck=1;
        }

        if(board[to.posX][to.posY].equals("w"))         //water
        {
            System.out.println("Invalid move");
            return false;
        } else if(to.posX==loc.posX && Math.abs(to.posY-loc.posY)==1)  // moving horizontally
        {
            if(convertCheck==1 && this.getTeam()==temp.getTeam())
            { return false; } //same piece
            if(convertCheck==1 && temp.getTeam()!=this.getTeam())
            {
                flag=capture(temp,board);
                return flag;
            }
            if(convertCheck==1 && temp.getClass()==Trap.class && temp.getTeam()!=this.getTeam())
            { this.setStrength(0);
              System.out.println(this.getStrength());
            }

            Object swap=board[loc.posX][loc.posY];
            board[loc.posX][loc.posY]= board[to.posX][to.posY];
            board[to.posX][to.posY]=swap;
            Piece p=(Piece) board[to.posX][to.posY];
            p.setLocation(to.posX,to.posY);

        }else if(to.posY==loc.posY && Math.abs(to.posX-loc.posX)==1)  //moving vertically
        {
            if(convertCheck==1 && this.getTeam()==temp.getTeam())
            { return false; } //same piece
            if(convertCheck==1 && temp.getTeam()!=this.getTeam())
            {
                flag=capture(temp,board);
                return flag;
            }

            if(convertCheck==1 && temp.getClass()==Trap.class)
            {
                this.setStrength(0);
            }
                Object swap=board[loc.posX][loc.posY];
                board[loc.posX][loc.posY]= board[to.posX][to.posY];
                board[to.posX][to.posY]=swap;
                Piece p=(Piece)board[to.posX][to.posY];
                p.setLocation(to.posX,to.posY);

        } else
        {
            System.out.println("Invalid move");
            return false;
        }

        return true;
    }



    public boolean capture(Piece other,Object[][] board)
    {

       if(this.getStrength()>=other.getStrength())
        {

            Object swap=board[loc.posX][loc.posY];
            board[loc.posX][loc.posY]= board[other.getLocation().posX][other.getLocation().posY];
            board[other.getLocation().posX][other.getLocation().posY]=swap;
            Piece p=(Piece)board[other.getLocation().posX][other.getLocation().posY];
            p.setLocation(other.getLocation().posX,other.getLocation().posY);
                if(other.getTeam()==0)
                {
                }else if(other.getTeam()==1)
                {

                }
        } else
        {
            System.out.println("Can't capture.");
            return false;
        }

        return true;
    }

    public void setStrength(int stg)
    {
       this.strength=stg;
    }

    public void setTeam(int side)
    {
        this.team=side;
    }
    public int getStrength()
    {
        return this.strength;
    }
    public int getTeam()
    {
        return this.team;
    }

    public void setLocation(int x, int y)
    {
        Location newLoc= new Location();
        newLoc.posX=x;
        newLoc.posY=y;
        this.loc=newLoc;
    }

    public Location getLocation()
    {
        return this.loc;
    }

    public String getSymbol()
    {
        return this.symbol;
    }

    public void setSymbol(String letter)
    {
        this.symbol=letter;
    }




}
