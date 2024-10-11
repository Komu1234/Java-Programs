import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num < 1000){
            System.out.println(num);
        }
        else if(num > 1000 && num <5000){
            System.out.println("Commision = "+(num *10)/100);
        }
        else if(num > 5000 && num < 10000){
            System.out.println("Commision = "+(num *20)/100);
        }
        else{
            
                System.out.println("Commision = "+(num * 30)/100);
            
        }
        
    }
}
