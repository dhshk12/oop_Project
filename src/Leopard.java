class Leopard extends Piece {

    private String symbol;
    Leopard()
    {
        this.symbol="l";

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



}