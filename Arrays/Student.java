public class Student {
  static String firstName;
  static String lastName;
  static int registration;
  static int grade;
  static int year;

  public Student() {

  }

  public Student(String firstname, String lastname) {
    firstName = firstname;
    lastName = lastname;
  }

  public Student(String firstname, String lastname, int registration1) {
    firstName = firstname;
    lastName = lastname;
    registration = registration1;
  }

  public Student(String firstname, String lastname, int grade1, int year1) {
    firstName = firstname;
    lastName = lastname;
    grade = grade1;
    year = year1;
  }

  public void printFullName() {
    System.out.println(firstName + " " + lastName);
  }

  public boolean isApproved() {
    if (grade >= 60)
      return true;
    return false;
  }

  public void changeYearIfApproved() {
    if (grade >= 60) {
      year++;
      System.out.println("Congragulations");
    }

  }

}
