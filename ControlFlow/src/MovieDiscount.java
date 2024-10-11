import java.util.*;
public class MovieDiscount {

  static int price = 70;
  static int age=0,person=0;
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        age = sc.nextInt();
        System.out.println("Enter no of Person : ");
        person = sc.nextInt();


        Discount(age);

        }
        public static void Discount(int age){
            if(age < 5){
              System.out.println("Amount is: "+(price -(price *60)/100));
            }
            else if(age > 60){
              System.out.println("Amount is: "+(price -(price *55)/100));
            }
            else{
              int total  = person * price;
              if(person < 2)
              System.out.println("Amount is: "+total);
              else{
                System.out.println("Amount is: "+((total - (total*30)/100)));
              }
            }
        }
        
      }

