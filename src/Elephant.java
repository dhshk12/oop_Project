class Elephant extends Piece {
   private String symbol;
   Elephant(){
      this.symbol = "e";
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
