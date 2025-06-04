public class Task009 {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 78;
        int num3 = 12;

        System.out.println("Checking numbers: " + num1 + ", " + num2 + ", " + num3);

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println(num3 + " is the greatest number.");
        }
    
}
}