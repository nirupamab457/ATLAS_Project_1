import java.util.Scanner;

public class Task006 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please enter your Login ID:");

       
        String loginID = scanner.nextLine();

        System.out.println("Please enter your Password:");

        
         String Password = scanner.nextLine();

        
        System.out.println("Hi");
        System.out.println("Your Login ID is: " + loginID);
        System.out.println("And your Password is "  + Password);
        


        scanner.close();
    }
}
