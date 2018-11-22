class King extends Piece {

    private String symbol;
    King(){
        this.symbol = "k";
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
