package other;
import cert.Parent;

public class Child extends Parent {
  public void testIt() {
    System.out.println("x is " + x);
  }

  public static void main(String[] args) {
      Child c = new Child();
      c.testIt();
  }
}
