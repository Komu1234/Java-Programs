public class Employee{
  String firstName, lastName;
  int registration, age, daysWorked,yearsWorked,vacationDaysTaken;
  double salary;


  public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int yearsWorked,
      int vacationDaysTaken, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.registration = registration;
    this.age = age;
    this.daysWorked = daysWorked;
    this.yearsWorked = yearsWorked;
    this.vacationDaysTaken = vacationDaysTaken;
    this.salary = salary;
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