import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {

        String name1;
        String name2;
        Player p1;
        Player p2;
        int opt;

        Scanner in = new Scanner(System.in);

        System.out.println("Press (1):New Game, (2):Saved Game:");
        opt=in.nextInt();
        if(opt==1)
        {
            p1=new Player();
            p2=new Player();
            Game g1= new Game(p1,p2);
            g1.start();

        }else if(opt==2)
        {

        }else
        {

        }






    }
}
