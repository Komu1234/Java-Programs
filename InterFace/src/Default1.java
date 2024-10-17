
interface Drawable1{
  void draw();
  default void msg(){
    System.out.println("Default Message");
  }
  static int cube(int x){
        return x*x*x;
  }
}

class Recta implements Drawable1{
  public void draw(){
    System.out.println("Drawing method");
  }
}
public class Default1 {
  public static void main(String[] args) {
    Drawable1 d = new Recta();
    d.draw();
    d.msg();
    System.out.println(Drawable1.cube(3));
  }
}
