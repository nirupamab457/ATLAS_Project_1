import java.util.Scanner;

public class Task011 {

    public static void main(String[] args) {
        String correctLoginID = "bnirupam";
        String correctPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;

        

        while (!isAuthenticated) {
            System.out.println("\nPlease enter your Login ID:");
            String enteredLoginID = scanner.nextLine();
            System.out.println("Please enter your Password:");
            String enteredPassword = scanner.nextLine();

            if (enteredLoginID.equals(correctLoginID) && enteredPassword.equals(correctPassword)) {
                isAuthenticated = true;
                System.out.println("\nLogin Successful! Welcome, " + enteredLoginID + ".");
            } else {
                System.out.println("\nInvalid Login ID or Password. Please try again.");
            }
        }
        scanner.close();
       
    }
}
    

