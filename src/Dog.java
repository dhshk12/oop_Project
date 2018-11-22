class Dog extends Piece {
    private String symbol;
    Dog(){
        this.symbol = "d";
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
