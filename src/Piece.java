public class Piece extends Game {

    public class location
    {
        private int posX;
        private int posY;
    }

    private location loc;
    private int strength;
    private int team;


    public void move(location from, location to)
    {
        int offsetX, offsetY;
       location newLocation=null;
       offsetY = to.posY-from.posY;
       offsetX = to.posX - from.posX;
       newLocation.posY = from.posY + offsetY;
       newLocation.posX = from.posX + offsetX;


    }


    public void capture(Piece other)
    {
        if (this.strength>=other.strength)
        {

        }

    }

    public String toString()
    {
        return "";
    }



}
