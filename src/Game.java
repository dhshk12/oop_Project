import java.util.ArrayList;
import java.util.Scanner;

import java.io.Serializable;

class Game implements Serializable {

    private static final long serialVersionUID = 1L;
    private Player x;
    private Player y;
    private final Object[][] board= new Object[9][7];

    private final Scanner in = new Scanner(System.in);

    Game() {}

    public Game(Player x, Player y)
    {
        this.x=x;
        this.y=y;

    }

    public void start()
    {
        initializeBoard();
        System.out.println("Enter Player 1's name:");
        x.setName(in.next());
        System.out.println("Enter Player 2's name:");
        y.setName(in.next());
        x.initializePieces();
        printBoard();


        System.out.print("Player 1, enter your command: ");

        System.out.print("Player 2, enter your command: ");



    }



    private void printBoard()
    {
        for (Object[] aBoard : board) {
            for (Object anABoard : aBoard) {
                System.out.print(anABoard.toString() + " ");
            }
            System.out.println();
        }
    }

    private void initializeBoard()
    {
        ArrayList<Piece> xPieces=x.getPieces();
        ArrayList<Piece> yPieces=y.getPieces();

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]='0';
            }
        }
        //river
            board[3][1] = "w";
            board[3][2] = "w";
            board[3][4] = "w";
            board[3][5] = "w";
            board[4][1] = "w";
            board[4][2] = "w";
            board[4][4] = "w";
            board[4][5] = "w";
            board[5][1] = "w";
            board[5][2] = "w";
            board[5][4] = "w";
            board[5][5] = "w";

            board[0][0]=xPieces.get(0);
            board[0][2]=xPieces.get(6);//trap 3
            board[0][3]=xPieces.get(2);
            board[0][4]=xPieces.get(1); //trap1
            board[0][6]=xPieces.get(4);
            board[1][1]=xPieces.get(5);
            board[1][3]=xPieces.get(3);//trap 2
            board[1][5]=xPieces.get(7);
            board[2][0]=xPieces.get(8);
            board[2][2]=xPieces.get(9);
            board[2][4]=xPieces.get(10);
            board[2][6]=xPieces.get(11);

            board[6][0]=yPieces.get(11);
            board[6][2]=yPieces.get(10);
            board[6][4]=yPieces.get(9);
            board[6][6]=yPieces.get(8);
            board[7][1]=yPieces.get(7);
            board[7][3]=yPieces.get(3); //trap 2
            board[7][5]=yPieces.get(5);
            board[8][0]=yPieces.get(4);
            board[8][2]=yPieces.get(1); //trap1
            board[8][3]=yPieces.get(2);
            board[8][4]=yPieces.get(6); //trap3
            board[8][6]=yPieces.get(0);

    }

}
