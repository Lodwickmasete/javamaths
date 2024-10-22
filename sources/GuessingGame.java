import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; 
        Scanner scanner = new Scanner(System.in);

        int guesses = 0;
        boolean guessedCorrectly = false;

        System.out.println("I've chosen a secret number between 1 and 100.");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            guesses++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + guesses + " guesses.");
            }
        }
    }
}