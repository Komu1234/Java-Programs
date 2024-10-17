package HackerRank;
import java.util.*;

public class SumOfOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int[] arra1 = new int[9];

    for(int i =0;i<arra1.length;i++){
      arra1[i] = sc.nextInt();
    }

    for(int i=0;i< arra1.length;i++){
      if(arra1[i] % 2 != 0){
        sum += arra1[i];
      }
      
    }

    System.out.println(sum);
    sc.close();
  }
}
