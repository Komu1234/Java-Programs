interface Printable1{
  void print1();
}
interface Showable extends Printable1{
  void show();
}


public class TestInterface3 implements Showable {

  public void print1(){
    System.out.println("Print the message");
  }

  public void show(){
    System.out.println("Show the message in main");
  }
  public static void main(String[] args) {
    
    TestInterface3 obj = new TestInterface3();
    obj.show();
    obj.print1();
  }
}
