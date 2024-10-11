package SearchAlgo;

import java.util.*;
public class LinearSearch {

  public static void main(String[] args) {
    
    int search,i,num=0,pos= -1;
  
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Enter the numbers we have to store: ");
    num  = sc.nextInt();

    int[] array = new int[num];

    System.out.println("Enter the Array Elements: ");

    for(i = 0;i<num;i++){
        array[i] = sc.nextInt();
    }

    System.out.println("Enter the no we have to search: ");
    search = sc.nextInt();

  for(i = 0;i<array.length;i++){

      if(array[i] == search){
          pos = i;
          break;
        }
    }

    System.out.println("The key is exist in the array at "+pos);
  }
}