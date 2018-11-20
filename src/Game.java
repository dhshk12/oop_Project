import java.util.Scanner;

import java.io.Serializable;

public class Game implements Serializable {

    private static final long serialVersionUID = 1L;
    private Player x;
    private Player y;
    Object[][] board= new Object[9][7];

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


        System.out.print("Enter your command: ");



    }

    public void printBoard()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print(board[i][j].toString()+" ");
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

            board[0][0]=new Lion();
            board[0][2]=new Trap();
            board[0][3]=new King();
            board[0][4]=new Trap();
            board[0][6]=new Tiger();
            board[1][1]=new Dog();
            board[1][3]=new Trap();
            board[1][5]=new Cat();
            board[2][0]=new Rat();
            board[2][2]=new Leopard();
            board[2][4]=new Wolf();
            board[2][6]=new Elephant();

            board[6][0]=new Elephant();
            board[6][2]=new Wolf();
            board[6][4]=new Leopard();
            board[6][6]=new Rat();
            board[7][1]=new Cat();
            board[7][3]=new Trap();
            board[7][5]=new Dog();
            board[8][0]=new Tiger();
            board[8][2]=new Trap();
            board[8][3]=new King();
            board[8][4]=new Trap();
            board[8][6]=new Lion();


    }

    public Object[][] getBoard()
    {
        return this.board;
    }

}
