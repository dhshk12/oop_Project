class Wolf extends Piece {
    private String symbol;
    Wolf(){
        this.symbol = "f";
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
