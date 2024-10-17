package HackerRank;

import java.util.Scanner;

public class ListReplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    int size = sc.nextInt();

    int[] array = new int[size];

    for(int i=0;i<array.length;i++){
        array[i] = sc.nextInt();
    }

    for(int i=0;i<array.length;i++){
      int j=0;
      while(j<no){
        System.out.println(array[i]);
        j++;
      }
        
        
    
      
    }
    sc.close();
  }
}
