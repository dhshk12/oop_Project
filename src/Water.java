public class Water extends Piece {
    private String symbol;
    private int team;

    Water() {
        this.symbol = "w";
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
