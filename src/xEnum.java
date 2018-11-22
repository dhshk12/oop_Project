public enum xEnum{
    A(0), B(1), C(2), D(3),E(4),F(5),G(6);

    private final int symbol;

    xEnum(int symbol){
        this.symbol = symbol;
    }

    public int convert(char c) {

        int symbol=0;
        switch(c){
            case 'A':
                symbol= A.symbol;
                break;
            case 'B':
                symbol= B.symbol;
                break;
            case 'C':
                symbol= C.symbol;
                break;
            case 'D':
                symbol= D.symbol;
                break;
            case 'E':
                symbol= E.symbol;
                break;
            case 'F':
                symbol= F.symbol;
                break;
            case 'G':
                symbol= G.symbol;
                break;

        }
        return symbol;
    }


    public String toString(){
        return String.valueOf(symbol);
    }

}
