import java.util.Scanner;

public class CaesarCipher {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a message: ");
    String message = scanner.nextLine();
    System.out.print("Enter a shift value (1-25): ");
    int shift = scanner.nextInt();

    System.out.print("Do you want to encrypt or decrypt? (e/d): ");
    char choice = scanner.next().toLowerCase().charAt(0);

    String result = "";
    if (choice == 'e') {
      result = encrypt(message, shift);
    } else if (choice == 'd') {
      result = decrypt(message, shift);
    } else {
      System.out.println("Invalid choice.");
      return;
    }

    System.out.println("Result: " + result);
  }

  public static String encrypt(String message, int shift) {
    StringBuilder sb = new StringBuilder();
    for (char ch : message.toCharArray()) {
      if (Character.isLetter(ch)) {
        boolean isUpper = Character.isUpperCase(ch);
        char base = isUpper ? 'A' : 'a';
        int shiftedChar = (ch - base + shift) % 26 + base;
        sb.append((char) shiftedChar);
      } else {
        sb.append(ch); // Non-letter characters remain unchanged
      }
    }
    return sb.toString();
  }

  public static String decrypt(String message, int shift) {
    return encrypt(message, 26 - shift); // Decryption is the same as encrypting with the reverse shift
  }
}