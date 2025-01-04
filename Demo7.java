import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt for and read the user's roll number
        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();

        // Clear the scanner buffer before reading the phone number
        scanner.nextLine();

        // Prompt for and read the user's phone number
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        // Display the input
        System.out.println("\nDetails:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Phone Number: " + phoneNumber);

        // Close the scanner
        scanner.close();
    }
}
