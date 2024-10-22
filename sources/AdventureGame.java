import java.util.Scanner;

public class AdventureGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("You find yourself at a crossroads. To the north, a dark forest. To the south, a shimmering lake.");
    System.out.print("Which way do you go? (North/South): ");
    String direction = scanner.nextLine().toLowerCase();

    if (direction.equals("north")) {
      System.out.println("You enter the dark forest. The air is heavy with mist. You hear strange noises...");
      System.out.print("Do you venture deeper? (Yes/No): ");
      String choice = scanner.nextLine().toLowerCase();

      if (choice.equals("yes")) {
        System.out.println("You encounter a fearsome beast! You must fight for your life! (You lose!)");
      } else {
        System.out.println("You turn back, feeling a sense of relief.");
      }
    } else if (direction.equals("south")) {
      System.out.println("You reach the shimmering lake. The water is clear and inviting. You see a beautiful white swan...");
      System.out.print("Do you try to approach the swan? (Yes/No): ");
      String choice = scanner.nextLine().toLowerCase();

      if (choice.equals("yes")) {
        System.out.println("The swan flies away, but you find a hidden treasure! (You win!)");
      } else {
        System.out.println("You decide to admire the lake from a distance.");
      }
    } else {
      System.out.println("Invalid direction. You stand at the crossroads, lost and confused.");
    }
  }
}