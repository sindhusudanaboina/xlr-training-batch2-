import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10; 
            number /= 10;       
        }

        System.out.println("The answer is: " + sum);
        scanner.close();
    }
}
