class Lion extends Piece {

    private String symbol;
    Location loc;

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

  /*  public Object[][] move(Location to,Object[][] board)
    {
            board[loc.posX][loc.posY]="O";
            this.symbol=getSymbol();
            board[to.posX][to.posY]=this.symbol;

        return board;
    }
    */

}
