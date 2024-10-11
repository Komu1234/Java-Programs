import java.util.*;
public class Circle{

  static double area,diameter=0.0;
  static double perimeter=0;
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the diameter of the circle: ");
      diameter  = sc.nextDouble();

      perimeter = 2 * 3.14 * (diameter/2);

      System.out.println("radius = "+(diameter/2));
      System.out.println("Perimeter = "+perimeter);

      area =(Math.PI)* (diameter/2) *(diameter/2);
      System.out.println("Area = "+area);
  }
}