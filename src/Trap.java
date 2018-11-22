class Trap extends Piece {
    private String symbol;
    Trap(){
        this.symbol = "x";
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
