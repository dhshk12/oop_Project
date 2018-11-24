class Lion extends Piece {

    private String symbol;
    private Piece prevObject;//holds previous object in current position of piece.

    Location loc;

    Lion()
    {
        this.symbol="n";
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


    public void setPrevObject(Piece obj){this.prevObject = obj;}
    public Piece getPrevObject(){return this.prevObject;}
  /*  public boolean move(Location to,Object[][] board)
    {
            board[loc.posX][loc.posY]="O";
            this.symbol=getSymbol();
            board[to.posX][to.posY]=this.symbol;

        return true;
    }*/


}
