package HackerRank;
import java.util.Scanner;

public class ReverseList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 6;
    int[] arra1 = new int[n];

    for(int i =0;i<arra1.length;i++){
      arra1[i] = sc.nextInt();
    }

    for(int i = n-1;i >= 0;i--){
      System.out.println(arra1[i]);
    }
    sc.close();
  }
}
