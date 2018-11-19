import java.util.Scanner;

import java.io.Serializable;

public class Game implements Serializable {

    private static final long serialVersionUID = 1L;
    private Player x;
    private Player y;
    char[][] board= new char[9][7];

    Scanner in = new Scanner(System.in);

    public Game() {}

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
        printBoard();


    }

    public void printBoard()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void initializeBoard()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]='0';
            }
        }
        //river
            board[3][1] = 'w';
            board[3][2] = 'w';
            board[3][4] = 'w';
            board[3][5] = 'w';
            board[4][1] = 'w';
            board[4][2] = 'w';
            board[4][4] = 'w';
            board[4][5] = 'w';
            board[5][1] = 'w';
            board[5][2] = 'w';
            board[5][4] = 'w';
            board[5][5] = 'w';

    }

}
