import java.util.Scanner;
public class Task012 {

    public static void main(String[] args) {
        final String CORRECT_LOGIN_ID = "bnirupam";
        final String CORRECT_PASSWORD = "12345867";

        Scanner sc = new Scanner(System.in);
        String enteredLoginId;
        String enteredPassword;
        int count = 0;

        do{
        
            System.out.println("Please enter your Login ID:");
            enteredLoginId = sc.nextLine();

            System.out.println("Please enter your Password:");
            enteredPassword = sc.nextLine();

            if (!enteredLoginId.equals(CORRECT_LOGIN_ID) || !enteredPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("Invalid Login ID or Password. Please try again.");
            }
        
            
        } while (!enteredLoginId.equals(CORRECT_LOGIN_ID) || !enteredPassword.equals(CORRECT_PASSWORD));

        System.out.println("\nLogin Successful! Welcome, " + enteredLoginId + ".");

        sc.close();

    }
}
    
