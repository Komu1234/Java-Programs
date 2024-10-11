import java.util.Scanner;

public class WeightGuru {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the weight of the person: ");
    double weight = sc.nextDouble();

    System.out.println("Enter the height of the person: ");
    double height = sc.nextDouble();
    double bmi = 0;

    if (weight > 0 && weight <= 100 && height <= 2.7) {
      bmi = weight / (height * height);
      if (bmi < 18) {
        System.out.println("Under Weight");
      } else if (bmi > 18 && bmi < 23) {
        System.out.println("Normal Weight");
      } else if (bmi > 23 && bmi < 29.9) {
        System.out.println("OverWeight");
      } else {
          System.out.println("Obesity");
      }

    } else {
      System.out.println("Insufficient Data");
    }

  }
}
