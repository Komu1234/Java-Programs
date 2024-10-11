import java.util.Scanner;

public class PrintNameLetter {
  public static void main(String[] args) {
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("please the name of the person: ");

        name = sc.next();
        for(int i = 0;i<name.length();i++)
        {
          System.out.println(name.charAt(i));
        }
  }
}
