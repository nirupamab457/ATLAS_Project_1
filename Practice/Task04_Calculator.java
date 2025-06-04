public class Task04_Calculator {


    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0; 
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        int num1 = 10, num2 = 5; 

        
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + Task04_Calculator.add(num1, num2));
        System.out.println("Diff of " + num1 + " and " + num2 + " is " + Task04_Calculator.subtract(num1, num2));
        System.out.println("Product of " + num1 + " and " + num2 + " is " + Task04_Calculator.multiply(num1, num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is " + Task04_Calculator.divide(num1, num2));

        
        System.out.println("Division of " + num1 + " and 0 is " + Task04_Calculator.divide(num1, 0));

        System.out.println("Main ended");
    }
}