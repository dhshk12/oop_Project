import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class main {
    public static void main(String[] args)
    {

        String name1;
        String name2;
        Player p1;
        Player p2;
        int opt;

        Scanner in = new Scanner(System.in);



        try {
            System.out.println("Press (1):New Game, (2):Saved Game:");
            opt = in.nextInt();
            if (opt == 1) {
                p1 = new Player();
                p2 = new Player();
                Game g1 = new Game(p1, p2);
                g1.start();
                FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
                ObjectOutputStream o = new ObjectOutputStream(f);
                o.writeObject(g1);
                o.close();
                f.close();



            } else if (opt == 2) {
                FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
                ObjectInputStream oi = new ObjectInputStream(fi);

                Game ge1 = (Game) oi.readObject();
                System.out.println(ge1.board);

            } else {

            }


        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
