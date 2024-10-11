import java.lang.Thread;
public class PrintCounter {
  public static void main(String[] args) throws InterruptedException {
    for(int i = 15;i<=30;i = i+3){
      Thread.sleep(3000);
      System.out.println(i);
    }
  }
}
