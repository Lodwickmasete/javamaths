import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter temperature: ");
    double temperature = scanner.nextDouble();

    System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
    char unit = scanner.next().toUpperCase().charAt(0);

    double convertedTemperature;

    if (unit == 'C') {
      convertedTemperature = (temperature * 9 / 5) + 32;
      System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
    } else if (unit == 'F') {
      convertedTemperature = (temperature - 32) * 5 / 9;
      System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
    } else {
      System.out.println("Invalid unit.");
    }
  }
}
