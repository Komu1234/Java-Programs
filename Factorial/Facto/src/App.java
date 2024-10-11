import java.util.*;;
public class App {
    public static void main(String[] args) throws Exception {
        int i,fact=1;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        number = sc.nextInt();

        for(i=1;i<=number;i++){
            fact = fact * i;
        }

        System.out.println("Fact = "+fact);
    }
}
