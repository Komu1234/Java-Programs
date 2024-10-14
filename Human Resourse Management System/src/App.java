public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Komal", "Chaudhari", 2, 22, 2500, 10, 25, 10000);
        System.out.println("Time to Retirement         : "+e1.timeToRetirement(e1.age,e1.yearsWorked));
        System.out.println("Bonus                      : "+e1.calculateBonus(e1.salary));
        System.out.println("Vacation left time         : "+e1.vacationTimeLeft(1+e1.daysWorked,e1.vacationDaysTaken));

        SalesRep s1=new SalesRep("A", "sss", 10, 30, 730, 05, 30000, 2, 10000);
       SalesRep s2=new SalesRep("B", "ss", 15, 22, 730, 06, 50000, 2, 20000);
       SalesRep s3=new SalesRep("C", "ssss", 30, 24, 730, 07, 20000, 2, 30000);
       SalesRep s4=new SalesRep("D", "ssssss", 20, 20, 730, 04, 40000, 2, 10000);
       SalesRep s5=new SalesRep("E", "sss", 10, 30, 730, 03, 60000, 2, 20000);
       SalesRep s6=new SalesRep("F", "ssss", 20, 27, 730, 06, 80000, 2, 30000);

       double totalSales = s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade()+s4.getSalesMade()+s5.getSalesMade()+s6.getSalesMade();
    
       SalesManager SM=new SalesManager("Komal", "Chaudhari", 10, 30, 730, 05, 30000, 2, 30000,totalSales);
       SM.calculateComission();
       SM.PrintDetails();
    }
}
