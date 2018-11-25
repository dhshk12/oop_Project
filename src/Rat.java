class Rat extends Piece {

    private String symbol;
    Rat(){
        this.symbol = "r";
    }
    public String toString()
    {
        return this.symbol;
    }
    public String getSymbol()
    {
        return this.symbol;
    }

    public void setSymbol(String letter)
    {
        this.symbol=letter;
    }


    public boolean move(Location to,Object[][] board){


    }

    public boolean capture(Piece other,Object[][] board){
        if(other.getClass() == Elephant.class){
            this.setStrength(10); //temporarily set strength of rat to 10, so it can capture elephant.
        }
        if(this.getStrength()>=other.getStrength())
        {
            Location loc = this.getLocation();

            Object swap=board[loc.posX][loc.posY];
            board[loc.posX][loc.posY]= board[other.getLocation().posX][other.getLocation().posY];
            board[other.getLocation().posX][other.getLocation().posY]=swap;
            Piece p=(Piece)board[other.getLocation().posX][other.getLocation().posY];
            p.setLocation(other.getLocation().posX,other.getLocation().posY);
                /*if(other.getTeam()==0)
                {

                }else if(other.getTeam()==1)
                {

                }*/
           this.setStrength(1); //Makes sure to set strength of rat back to original, once it captures elephant.
        } else
        {
            System.out.println("Can't capture.");
            return false;
        }

        return true;
    }
