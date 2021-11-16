import java.util.Scanner;

public class Qn16CalculateTheQuotient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integer numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int quotient = num1 / num2 ;
        int remainder = num1 % num2;
        System.out.println("The quotient is of " + num1 + " and " + num2 + " is: " + quotient + " and the remainder of " + num1 + " and " + num2 +
                            " is: " + remainder);
    }
}
