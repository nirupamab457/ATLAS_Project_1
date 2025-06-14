class OuterClass2 {
  int x = 10;

  private class InnerClass2 {
    int y = 5;
  }
}
public class Task016 {
  public static void main(String[] args) {
    OuterClass2 myOuter = new OuterClass2();
    System.out.println(myOuter.x);
  }
}