

public class SalesManager extends SalesRep {

  double salesByTeam;
  
  

  public void calculateComission(){
    System.out.println("The Managers commission is : "+(float)(0.03f *salesByTeam));
 }



  
  public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int yearsWorked,
      int vacationDaysTaken, double salary, String userName, String password, double salesMade, double salesByTeam) {
    super(firstName, lastName, registration, age, daysWorked, yearsWorked, vacationDaysTaken, salary, userName,
        password, salesMade);
    this.salesByTeam = salesByTeam;
  }




  public void PrintDetails(){
    System.out.println("First Name: "+firstName);
    System.out.println("Last Name: "+lastName);
    System.out.println("Registration: "+registration);
    System.out.println("Age : "+age);
    System.out.println("Day worked: "+daysWorked);
    System.out.println("Year Worked: "+yearsWorked);
    System.out.println("Vacation Days: "+vacationDaysTaken);
    System.out.println("Salary: "+salary);
  

  }



}
