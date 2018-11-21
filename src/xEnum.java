public enum xEnum {
    A(0), B(1), C(2), D(3),E(4),F(5),G(6);

    private final int symbol;

    private xEnum(int symbol){
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
                symbol= B.symbol;
                break;

        }
        return symbol;
    }


    public String toString(){
        return String.valueOf(symbol);
    }

}
