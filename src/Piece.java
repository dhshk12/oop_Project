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
    private int idx;


    public boolean move(Location to,Object[][] board)
    {
        boolean flag;
        Piece temp=null;
        int captureCheck=0;
        if(board[to.posX][to.posY].getClass()!=String.class)
        {
            temp=(Piece)board[to.posX][to.posY];
            captureCheck=1;
        }

        if(board[to.posX][to.posY].equals("w"))         //water
        {
            System.out.println("Invalid move");
            return false;
        }else if(captureCheck==1 && temp.getTeam()!=this.getTeam())
        {
            flag=capture(temp,board);
            return flag;
        }
        else if(to.posX==loc.posX && Math.abs(to.posY-loc.posY)==1)  // moving horizontally
        {
            board[loc.posX][loc.posY]="O";
            this.symbol=getSymbol();
            board[to.posX][to.posY]=this.symbol;
        }else if(to.posY==loc.posY && Math.abs(to.posX-loc.posX)==1)  //moving vertically
        {
            board[loc.posX][loc.posY]="O";
            this.symbol=getSymbol();
            board[to.posX][to.posY]=this.symbol;
        }
        else
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
                this.symbol=getSymbol();
                board[loc.posX][loc.posY] ="0";
                board[other.getLocation().posX][other.getLocation().posY]=this.symbol;
        }else
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
