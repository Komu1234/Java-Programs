import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Grade of a student: ");
        int grade = sc.nextInt();

        if(grade > 0 && grade <= 3){
            System.out.println("Failed");
        }
        else if(grade > 3 && grade <= 5){
            System.out.println("Marks is insufficient");
        }
        else if(grade > 5 && grade <= 8){
            System.out.println("Marks is Good");
        }
        else if(grade > 8 && grade <= 10){
            System.out.println("Excellent");
        }else{
            
            System.out.println("Marks is  the insufficient");
        }




    }
}
