import java.util.*;
public class UserProfile {

  public static void main(String[] args) {
      String userName,jobPreference;
      String nationality;
      int age= 0,year;
      char gender,bloodGroup;

      Scanner sc = new Scanner(System.in);
      age = sc.nextInt();
      userName = sc.nextLine();
      jobPreference = sc.nextLine();
      nationality = sc.nextLine();
      gender = sc.next().charAt(0);
      bloodGroup = sc.next().charAt(0);
      year = 2024 - age;                          
      System.out.println(year);
      System.out.println(age);
      System.out.println(userName);
      System.out.println(jobPreference);
      System.out.println(nationality);
      System.out.println(gender);
      System.out.println(bloodGroup);


      
  }
}
