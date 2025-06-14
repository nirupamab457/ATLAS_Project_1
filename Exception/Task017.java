class OuterClass3 {
  int x = 10;

  static class InnerClass3 {
    int y = 5;
  }
}

public class Task017 {
  public static void main(String[] args) {
    OuterClass3 myOuter = new OuterClass3();
    OuterClass3.InnerClass3 myInner = new OuterClass3.InnerClass3();
    System.out.println(myInner.y + myOuter.x);
  }
}
