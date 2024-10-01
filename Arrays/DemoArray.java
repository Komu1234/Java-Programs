package Arrays;

public class DemoArray {
  public static void main(String[] args) {
    int[] anArray = new int[10];
    byte[] anArray1 = new byte[10];
    for (int i = 0; i < anArray.length; i++) {
      int y = i + 20 * 30;
      System.out.println(anArray[i] = y);
      System.out.println(System.identityHashCode(anArray[i]));

    }
    for (int i = 0; i < anArray1.length; i++) {
      int y = i+20;
      System.out.println(anArray1[i] + y(byte));

    }
  }

}