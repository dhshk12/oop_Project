class Piece extends Game {

    class Location
    {
        int posX;
        int posY;
    }

    private Location loc;
    private int strength ;
    private int team;


    public void move(Location to)
    {
        /*int offsetX, offsetY;
       Location newLocation=null;
       offsetY = to.posY - this.loc.posY;
       offsetX = to.posX - from.posX;
       newLocation.posY = from.posY + offsetY;
       newLocation.posX = from.posX + offsetX;*/




    }

    public void capture(Piece other)
    {
        if (this.strength>=other.strength)
        {

        }
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





}
