import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        int vowelCount = 0;
        
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        
        System.out.printf("Number of vowels in the string: %d%n", vowelCount);
    }
}