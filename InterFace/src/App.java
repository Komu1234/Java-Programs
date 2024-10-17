interface printTable{
    void print();

}

class A1 implements printTable{
    public void print(){
        System.out.println("Hello");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        A1 obj = new A1();
        obj.print();
    }
}
