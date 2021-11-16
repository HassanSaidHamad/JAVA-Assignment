import java.util.Scanner;

public class Qn9CelsiusToFahrenheitTempConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius: ");
        double tempCelsius = scanner.nextDouble();

        double Fahrenheit = 1.8 * tempCelsius + 32;
        System.out.println("The temperature converted to Fahrenheit is: " + Fahrenheit);
    }
}
