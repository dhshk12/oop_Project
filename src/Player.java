import java.lang.reflect.Array;
import java.util.ArrayList;

class Player extends Game {
    private String name;
    private final ArrayList<Piece> pieces= new ArrayList<>();

    public Player() {
        initializePieces();
    }

    public Player(String name)
    {
        this.name=name;
    }

    public void setName(String s)
    {
        this.name=s;
    }

    public String getName()
    {
        return this.name;
    }

    public void initializePieces()
    {
        pieces.add(new Lion());
        pieces.add(new Trap());
        pieces.add(new King());
        pieces.add(new Trap());
        pieces.add(new Tiger());
        pieces.add(new Dog());
        pieces.add(new Trap());
        pieces.add(new Cat());
        pieces.add(new Rat());
        pieces.add(new Leopard());
        pieces.add(new Wolf());
        pieces.add(new Elephant());
    }

    public ArrayList<Piece> getPieces()
    {
        return this.pieces;
    }










}
