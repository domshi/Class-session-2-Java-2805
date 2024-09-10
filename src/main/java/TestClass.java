public class TestClass{
  private static final int DEF_A = 10;
  private static final int DEF_B = 20;
  private static final int DEF_C = 13;

  private int a, b, c;
  
  private TestClass (int newA, int newB, int newC) {
    a = newA;
    b = newB;
    c = newC;
  } // end constructor

  public TestClass () {
    this(DEF_A, DEF_B, DEF_C);
  }
  
  public TestClass (int newA) {
    this (newA, DEF_B, DEF_C);
  }
  
  public String toString() {
    return "The value of a is " + a + "\nand b is " + b + "\nand c is " + c;
  } 
}