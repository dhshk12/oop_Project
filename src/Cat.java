class Cat extends Piece {
    private String symbol;
    Cat()
    {
        this.symbol = "c";
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
