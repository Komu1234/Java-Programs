public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Komal", "Chaudhari", 2, 22, 2500, 10, 25, 10000,"PrasadC","123");
        System.out.println("Time to Retirement         : "+e1.timeToRetirement(e1.age,e1.yearsWorked));
        System.out.println("Bonus                      : "+e1.calculateBonus(e1.salary));
        System.out.println("Vacation left time         : "+e1.vacationTimeLeft(1+e1.daysWorked,e1.vacationDaysTaken));

        SalesRep s1=new SalesRep("A", "sss", 10, 30, 730, 05, 30000, 2,"PrasadC","123", 10000);
       SalesRep s2=new SalesRep("B", "ss", 15, 22, 730, 06, 50000, 2,"Komalc","1234", 20000);
       

       double totalSales = s1.getSalesMade()+s2.getSalesMade();
    
       SalesManager SM=new SalesManager("Komal", "Chaudhari", 10, 30, 730, 05, 30000, 2,"Komalc","1234", 30000,totalSales);
       SM.calculateComission();
       SM.PrintDetails();
       System.out.println(SM.login("Komalc", "1234"));
    }
}
