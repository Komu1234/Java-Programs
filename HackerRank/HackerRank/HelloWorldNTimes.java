package HackerRank;

import java.util.Scanner;

public class HelloWorldNTimes {
  public static void main(String[] args) {
    int num = 0;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    for(int i=0;i<num;i++){
      System.out.println("Hello World");
    }
    sc.close();
  }
}
