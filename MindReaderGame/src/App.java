import java.util.Random;
import java.util.Scanner;
class Player_A {
    int p_scr = 0;
    int p_input;
    String name;
    public Player_A(String namePassed) {
        this.name = namePassed;
    }
    public void printPlayerDetails() {
        System.out.println("Name of the Player : "+name);
        System.out.println("");
    }
}

class Computer {
    int c_scr = 0;
    int c_pred;
    String name = "Bahubali";

    public int prediction() {
        Random r = new Random();
        return r.nextInt(2);
    }   

    public void playerDetails() {
        System.out.println("Name of the Player : "+name);
        System.out.println("");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        
        Player_A p = new Player_A("Komal");
        Computer c  = new Computer();
        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            System.out.println("Enter your Input");
            p.p_input = sc.nextInt();
            System.out.println("You Entered"+p.p_input);
            c.c_pred = c.prediction();

            if(p.p_input == c.c_pred)
            {
                System.out.println("****************************Current Score**************************");
                c.c_scr++;
                c.playerDetails();
                p.printPlayerDetails();
            }
            else{
                System.out.println("****************************Current Score**************************");
                p.p_scr++;
                p.printPlayerDetails();
                c.playerDetails();
            }

            System.out.println("Computer Score"+c.c_scr);
            System.out.println("Player Score"+p.p_scr);

            if(c.c_scr == 4){
                System.out.println("****************************Winner is**************************");
                c.playerDetails();
                break;
            }
            else if(p.p_scr == 4){
                System.out.println("****************************Winner is**************************");
                p.printPlayerDetails();
                break;
    
            }
        }


    }
}
