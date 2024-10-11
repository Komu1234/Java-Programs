import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Console console = System.console();
   System.out.println("Please enter your name ");
   String name = console.readLine();

   System.out.println("My name is "+ name);
    }
}
