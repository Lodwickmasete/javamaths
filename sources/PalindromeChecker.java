import java.util.Scanner;

public class PalindromeChecker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();

    String reversedString = new StringBuilder(inputString).reverse().toString();

    if (inputString.equalsIgnoreCase(reversedString)) {
      System.out.println(inputString + " is a palindrome.");
    } else {
      System.out.println(inputString + " is not a palindrome.");
    }
  }
}