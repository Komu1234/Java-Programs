
import java.lang.*;
public class Armstrong {
  public static void main(String[] args) {
    
    int num = 153,sum=0;
    int temp = num;
    int count = String.valueOf(num).length();
   

    for(int i = 0;i<count;i++){
      int rev = num%10;
      sum += Math.pow(rev,count);
      num = num/10;
    }

    System.out.println(sum);


    if(temp == sum){
      System.out.println("Aramstrong");
      System.out.println((int)Math.random());

    }
    else{
      System.out.println("not Aramstrong");
    }
  }
  
}
