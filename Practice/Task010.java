import java.util.Scanner;
public class Task010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number");
        int dayNumber = scanner.nextInt();

        String dayName = switch (dayNumber) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid Input";
        };
        System.out.println(dayNumber + " is " + dayName);
}
}