import java.util.Scanner;

public class Task008 {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed name: " + reversed);

        scanner.close();
    }
}
