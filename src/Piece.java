import java.util.List;

public abstract class Piece  {
    private int posX;
    private int posY;

    public abstract void move(int movePos);


    public abstract List<String> legalMoves();


}
