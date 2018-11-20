class Piece extends Game {

    class Location
    {
        int posX;
        int posY;
    }

    private Location loc;
    private int strength ;
    private int team;


    public void move(Location from, Location to)
    {
        int offsetX, offsetY;
       Location newLocation=null;
       offsetY = to.posY-from.posY;
       offsetX = to.posX - from.posX;
        assert newLocation != null;
        newLocation.posY = from.posY + offsetY;
       newLocation.posX = from.posX + offsetX;

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




}
