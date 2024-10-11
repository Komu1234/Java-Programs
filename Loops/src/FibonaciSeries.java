public class FibonaciSeries {
    public static void main(String[] args) {
          int n1=0,n2=1,n3,i=0;

          do{

            System.out.println(n1);
            n3= n1+n2;

            n1=n2;
            n2=n3;
            i++;

          }while(i<20);
    }
}
