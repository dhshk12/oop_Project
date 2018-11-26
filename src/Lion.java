class Lion extends Piece {

    private String symbol;
    private Location loc;
    private int strength;
    private int team;
    private Object[] store = new Object[1];

    Lion() {
        this.symbol = "n";
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