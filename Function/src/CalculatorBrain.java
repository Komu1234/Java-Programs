import java.util.Scanner;

public class CalculatorBrain {
  static int a= 0,b = 0,c=0,d=0;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    
    addition(a, b);
    subtraction(a, b);
    multiplication(a, b);
  division(a, b);
  powOf(c, d);
  squareRoot(a);



  }

  public static void addition(int a, int b) {
        System.out.println("Addition = "+(a+b));
  }
  public static void subtraction(int a, int b) {
    System.out.println("Subtraction = "+(a-b));
}
public static void multiplication(int a, int b) {
  System.out.println("Multiplication = "+(a*b));
}
public static void division(int a, int b) {
  System.out.println("Division = "+(a/b));
}
public static void squareRoot(int a) {
  System.out.println("SquareRoot = "+(Math.sqrt(a)));
}

public static void powOf(double c,double d)  {
  System.out.println("Power of "+a+" ="+(Math.pow(c, d)));
}

}
