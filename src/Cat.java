class Cat extends Piece {
    private String symbol;
    Cat()
    {
        this.symbol = "c";
        this.prevObject = null;
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

    private Piece prevObject;//holds previous object in current position of piece.
    public void setPrevObject(Piece obj){this.prevObject = obj;}
    public Piece getPrevObject(){return this.prevObject;}
}
