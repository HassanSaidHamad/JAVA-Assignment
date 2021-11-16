import java.util.Scanner;

public class Qn12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = (num1 + num2);
        int product = (num1 * num2);
        int difference = (num1 - num2);
        int quotient = (num1 / num2);

        System.out.println("The sum is: " + sum + "\nThe product is: " + product + "\nThe difference is: " + difference + "\nThe quotient is: " + quotient);

    }

}
