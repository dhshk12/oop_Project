class Tiger extends Piece {
    private String symbol;
    Tiger(){
        this.symbol = "t";
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
