class Leopard extends Piece {

    private String symbol;
    Leopard()
    {
        this.symbol="l";
        this.prevObject = null;
    }

    public String toString() {
        return symbol;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String letter) {
        this.symbol = letter;
    }

    private Piece prevObject;//holds previous object in current position of piece.


}