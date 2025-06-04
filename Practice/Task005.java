public class Task005 {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;

      String result = (a > b) ? "" + a + " is greater than " + b + "." : " " + b + " is greater than " + a + ".";
      
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(result);
    }
}
