import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        int sum = 0;
        
        while (number != 0) {
            sum += number % 10; // Add last digit to sum
            number /= 10;       // Remove last digit
        }
        
        System.out.printf("Sum of digits: %d%n", sum);
    }
}