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


    public Object[][] move(Location to,Object[][] board)
    {
        if(board[to.posX][to.posY].equals("w"))
        {
            System.out.print("Invalid move");
        }

        board[loc.posX][loc.posY]="O";
        this.symbol=getSymbol();
        board[to.posX][to.posY]=symbol;

        return board;

    }

    public void capture(Piece other)
    {

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
