class Lion extends Piece {

    private String symbol;

    Lion()
    {
        this.symbol="n";
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
