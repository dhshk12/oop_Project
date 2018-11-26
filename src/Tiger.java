class Tiger extends Piece {
    private String symbol;

    private int strength;
    private int team;
    private Object[] store = new Object[1];

    Tiger() {
        this.symbol = "t";

    }

    public String toString() {
        return this.symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String letter) {
        this.symbol = letter;
    }

}