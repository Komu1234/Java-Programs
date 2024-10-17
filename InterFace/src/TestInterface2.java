
interface Bank{
  float rateOfInterest();
}

class SBI implements Bank{
  public float rateOfInterest(){
    return 9.15f;
  }
}

class PNB implements Bank{
  public float rateOfInterest(){
    return 18.5f;
  }
}
public class TestInterface2 {
    public static void main(String[] args) {
      Bank b = new SBI();
      System.out.println("Rate of Interest : "+b.rateOfInterest()+" %");

      Bank b1 = new PNB();
      System.out.println("Rate of interest : "+b1.rateOfInterest()+" %");
    }
}
