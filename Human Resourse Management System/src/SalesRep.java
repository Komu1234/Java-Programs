public class SalesRep extends Employee {
  private double salesMade;
  
  public double getSalesMade() {
    return salesMade;
}

public void setSalesMade(double salesMade) {
    this.salesMade = salesMade;
}
  public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int yearsWorked,
      int vacationDaysTaken, double salary, double salesMade) {
    super(firstName, lastName, registration, age, daysWorked, yearsWorked, vacationDaysTaken, salary);
    this.salesMade = salesMade;
  }

  
  
}
