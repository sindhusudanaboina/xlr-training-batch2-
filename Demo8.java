import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (number <= 0);

        System.out.println("You entered a positive number: " + number);

        // Close the scanner
        scanner.close();
    }
}
