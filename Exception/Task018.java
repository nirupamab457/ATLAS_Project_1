class OuterClass4 {
    int x = 50;

    class InnerClass4 {
        int y = 5;

        public int innerMethod() {
            return x;
        }
    }
}

public class Task018 {

    public static void main(String[] args) {
        OuterClass4 myOuter = new OuterClass4();
        OuterClass4.InnerClass4 myInner = myOuter.new InnerClass4();
        System.out.println(myInner.innerMethod());
    }

}
