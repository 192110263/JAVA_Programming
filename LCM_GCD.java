package Practice.Easy;
import java.util.Scanner;
public class  LCM_GCD{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate GCD
        int a = num1, b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcdResult = a;

        // Calculate LCM
        int lcmResult = Math.abs(num1 * num2) / gcdResult;

        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);

        scanner.close();
    }
}
