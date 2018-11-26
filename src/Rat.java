class Rat extends Piece {

    private String symbol;
    private Object[] store= new Object[1];

    Rat(){
        this.symbol = "r";
    }

    private Location loc;

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
