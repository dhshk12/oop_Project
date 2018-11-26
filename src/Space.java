public class Space extends Piece {
    private String symbol;
    private int team;

    Space() {
        this.symbol = "0";
        this.team=2;
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
