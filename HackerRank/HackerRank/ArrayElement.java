package HackerRank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    List<Integer> list = new ArrayList<>(num);


    for(int i = 1;i<= num;i++){
      list.add(i);


    }
    System.out.print(list);
    sc.close();
  }
}
