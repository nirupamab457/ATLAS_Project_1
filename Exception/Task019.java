class OuterClass5 {
    int x = 50;

    static class InnerClass5 {
       static int y = 5;
    }
}

public class Task019 {

    public static void main(String[] args) {
        OuterClass5.InnerClass5 myInner = new OuterClass5.InnerClass5();
        System.out.println(myInner.y);
    }

}
