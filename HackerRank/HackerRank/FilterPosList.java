package HackerRank;

import java.util.Scanner;

public class FilterPosList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] arra1 = new int[9];

    for(int i =0;i<arra1.length;i++){
      arra1[i] = sc.nextInt();
    }

    for(int i=0;i< arra1.length;i++){
      if(i%2 == 0){
        System.out.println(arra1[i]);
      }
    }
    sc.close();
  }
}
