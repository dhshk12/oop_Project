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




}
