import java.util.Scanner;

public class Demo037 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        System.out.print("Enter fourth number: ");
        int d = scanner.nextInt();


        if (a >= b && a >= b) {
            System.out.println("The biggest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The biggest number is: " + b);
        } else if (c >=a && c >= d)
             System.out.println("The biggest number is: "+ c);
         else {
            System.out.println("The biggest number is: " + d);
        }

        scanner.close();
    }
}
