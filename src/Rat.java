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

    }
