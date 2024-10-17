package HackerRank;

import java.util.Scanner;



public class FilterArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    int[] arra1 = new int[6];

    for(int i =0;i<arra1.length;i++){
      arra1[i] = sc.nextInt();
    }

    for(int i=0;i< arra1.length;i++){
      if(arra1[i] < no){
        System.out.println(arra1[i]);
      }
    }
    sc.close();
  }
}
