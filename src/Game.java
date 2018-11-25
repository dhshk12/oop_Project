import java.util.ArrayList;
import java.util.Scanner;

class Game  {

    private static final long serialVersionUID = 1L;
    private Player x;
    private Player y;
    public Object[][] board= new Object[9][7];
    private final Scanner in = new Scanner(System.in);
    public ArrayList<Piece> xPieces=new ArrayList<>();
    public ArrayList<Piece> yPieces=new ArrayList<>();


    Game() {}

    public Game(Player x, Player y)
    {
        this.x=x;
        this.y=y;
        xPieces=x.getPieces();
        yPieces=y.getPieces();
        initializeBoard();
    }

    public void start()
    {
        System.out.println("Enter Player 1's name:");
        x.setName(in.next());
        System.out.println("Enter Player 2's name:");
        y.setName(in.next());
        printBoard();
        boolean status=false;

        while(true) {
            while (status == false) {
                String command1;
                System.out.print(x.getName() + ", enter your command: ");
                command1 = in.next();

                if (command1.substring(0, 4).equals("move")) {
                    status = moveCommand(x, command1);
                }
            }
            printBoard();
            status = false;

            while (status == false) {
                String command2;
                System.out.print(y.getName() + ", enter your command: ");
                command2 = in.next();
                if (command2.substring(0, 4).equals("move")) {
                    status = moveCommand(y, command2);
                }
            }
            printBoard();
            status = false;
        }
    }

    private boolean moveCommand(Player p,String command)
    {
        ArrayList<Piece> pPieces=p.getPieces();

        xEnum x=xEnum.A;
        String from= command.substring(4,6);
        String to=command.substring(6,8);

        Piece.Location toLoc= new Piece.Location();
        int xTo= x.convert(to.charAt(0));
        toLoc.posX=board.length-(Integer.parseInt(to.substring(1)));
        toLoc.posY=xTo;

        int xFrom= board.length-(Integer.parseInt(from.substring(1)));
        int yFrom= x.convert(from.charAt(0));
        boolean status = false;
       for(int i=0 ;i<pPieces.size();i++)
        {
            if((pPieces.get(i).getLocation().posX==xFrom) && (pPieces.get(i).getLocation().posY==yFrom))
            {
                status=pPieces.get(i).move(toLoc,board);
                break;
            }
        }
        if(status==false)
        { System.out.print("Invalid move "); }

        return status;
    }

    public void printBoard()
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
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]="0";
            }
        }
            board[3][1] = "w"; board[3][2] = "w";
            board[3][4] = "w"; board[3][5] = "w";
            board[4][1] = "w"; board[4][2] = "w";
            board[4][4] = "w"; board[4][5] = "w";
            board[5][1] = "w"; board[5][2] = "w";
            board[5][4] = "w"; board[5][5] = "w";


            board[0][0]=xPieces.get(0); //Lion
            xPieces.get(0).setLocation(0,0);
            board[0][2]=xPieces.get(6);//trap 3
            xPieces.get(6).setLocation(0,2);
            board[0][3]=xPieces.get(2); //King
            xPieces.get(2).setLocation(0,3);
            board[0][4]=xPieces.get(1); //trap1
            xPieces.get(1).setLocation(0,4);
            board[0][6]=xPieces.get(4); //Tiger
            xPieces.get(4).setLocation(0,6);
            board[1][1]=xPieces.get(5); //Dog
            xPieces.get(5).setLocation(1,1);
            board[1][3]=xPieces.get(3);//trap 2
            xPieces.get(3).setLocation(1,3); //Cat
            board[1][5]=xPieces.get(7);
            xPieces.get(7).setLocation(1,5); //Rat
            board[2][0]=xPieces.get(8);
            xPieces.get(8).setLocation(2,0); //Leopard
            board[2][2]=xPieces.get(9);
            xPieces.get(9).setLocation(2,2); // Wolf
            board[2][4]=xPieces.get(10);
            xPieces.get(10).setLocation(2,4); // Elephant
            board[2][6]=xPieces.get(11);
            xPieces.get(11).setLocation(2,6);

            for (int i=0;i<xPieces.size();i++)
            {
                if(xPieces.get(i).getClass()==Trap.class || xPieces.get(i).getClass()==King.class )
                { xPieces.get(i).setTeam(0); }
                else if(xPieces.get(i).getClass()==Elephant.class)
                { xPieces.get(i).setStrength(8); }
                else if(xPieces.get(i).getClass()==Lion.class)
                { xPieces.get(i).setStrength(7); }
                else if(xPieces.get(i).getClass()==Tiger.class)
                { xPieces.get(i).setStrength(6); }
                else if(xPieces.get(i).getClass()==Leopard.class)
                { xPieces.get(i).setStrength(5); }
                else if(xPieces.get(i).getClass()==Wolf.class)
                { xPieces.get(i).setStrength(4); }
                else if(xPieces.get(i).getClass()==Dog.class)
                { xPieces.get(i).setStrength(3);}
                else if(xPieces.get(i).getClass()==Cat.class)
                { xPieces.get(i).setStrength(2); }
                else if(xPieces.get(i).getClass()==Rat.class)
                { xPieces.get(i).setStrength(1); }
                xPieces.get(i).setTeam(0);

            }

            String temp;

            board[6][0]=yPieces.get(11);
            yPieces.get(11).setLocation(6,0);
            temp=yPieces.get(11).getSymbol();
            yPieces.get(11).setSymbol(temp.toUpperCase());

            board[6][2]=yPieces.get(10);
            yPieces.get(10).setLocation(6,2);
            temp=yPieces.get(10).getSymbol();
            yPieces.get(10).setSymbol(temp.toUpperCase());

            board[6][4]=yPieces.get(9);
            yPieces.get(9).setLocation(6,4);
            temp=yPieces.get(9).getSymbol();
            yPieces.get(9).setSymbol(temp.toUpperCase());

            board[6][6]=yPieces.get(8);
            yPieces.get(8).setLocation(6,6);
            temp=yPieces.get(8).getSymbol();
            yPieces.get(8).setSymbol(temp.toUpperCase());

            board[7][1]=yPieces.get(7);
            yPieces.get(7).setLocation(7,1);
            temp=yPieces.get(7).getSymbol();
            yPieces.get(7).setSymbol(temp.toUpperCase());

            board[7][3]=yPieces.get(3); //trap 2
            yPieces.get(3).setLocation(7,3);
            temp=yPieces.get(3).getSymbol();
            yPieces.get(3).setSymbol(temp.toUpperCase());

            board[7][5]=yPieces.get(5);
            yPieces.get(5).setLocation(7,5);
            temp=yPieces.get(5).getSymbol();
            yPieces.get(5).setSymbol(temp.toUpperCase());

            board[8][0]=yPieces.get(4);
            yPieces.get(4).setLocation(8,0);
            temp=yPieces.get(4).getSymbol();
            yPieces.get(4).setSymbol(temp.toUpperCase());

            board[8][2]=yPieces.get(1); //trap1
            yPieces.get(1).setLocation(8,2);
            temp=yPieces.get(1).getSymbol();
            yPieces.get(1).setSymbol(temp.toUpperCase());

            board[8][3]=yPieces.get(2);
            yPieces.get(2).setLocation(8,3);
            temp=yPieces.get(2).getSymbol();
            yPieces.get(2).setSymbol(temp.toUpperCase());

            board[8][4]=yPieces.get(6); //trap3
            yPieces.get(6).setLocation(8,4);
            temp=yPieces.get(6).getSymbol();
            yPieces.get(6).setSymbol(temp.toUpperCase());

            board[8][6]=yPieces.get(0);
            yPieces.get(0).setLocation(8,6);
            temp=yPieces.get(0).getSymbol();
            yPieces.get(0).setSymbol(temp.toUpperCase());

        for (int i=0;i<yPieces.size();i++)
        {
            if(yPieces.get(i).getClass()==Trap.class || yPieces.get(i).getClass()==King.class )
            { yPieces.get(i).setTeam(1); }
            else if(yPieces.get(i).getClass()==Elephant.class)
            { yPieces.get(i).setStrength(8); }
            else if(yPieces.get(i).getClass()==Lion.class)
            { yPieces.get(i).setStrength(7); }
            else if(yPieces.get(i).getClass()==Tiger.class)
            { yPieces.get(i).setStrength(6); }
            else if(yPieces.get(i).getClass()==Leopard.class)
            { yPieces.get(i).setStrength(5); }
            else if(yPieces.get(i).getClass()==Wolf.class)
            { yPieces.get(i).setStrength(4); }
            else if(yPieces.get(i).getClass()==Dog.class)
            { yPieces.get(i).setStrength(3);}
            else if(yPieces.get(i).getClass()==Cat.class)
            { yPieces.get(i).setStrength(2); }
            else if(yPieces.get(i).getClass()==Rat.class)
            { yPieces.get(i).setStrength(1); }
            yPieces.get(i).setTeam(1);
        }

    }



}
