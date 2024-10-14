public class Employee implements UserInterface{
  String firstName, lastName;
  int registration, age, daysWorked,yearsWorked,vacationDaysTaken;
  double salary;
  private String userName;
  private String password;


  public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int yearsWorked,
      int vacationDaysTaken, double salary,String userName,String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.registration = registration;
    this.age = age;
    this.daysWorked = daysWorked;
    this.yearsWorked = yearsWorked;
    this.vacationDaysTaken = vacationDaysTaken;
    this.salary = salary;
    this.userName = userName;
    this.password = password;
  }

  @Override
  public boolean login(String userName,String password) {
    return this.userName.equals(userName) && this.password.equals(password);
  }

  public int timeToRetirement(int age,int yearsWorked){
      return Math.min(60 - age, 40 - yearsWorked);

 }

 public int vacationTimeLeft(int daysWorked,int vacationDaysTaken){
     // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
     return (daysWorked/360)*(30 - vacationDaysTaken);
 }

 public double calculateBonus(double salary){
     return 2.2*salary;
 }



}