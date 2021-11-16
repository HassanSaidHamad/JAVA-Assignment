import java.util.Scanner;

public class Qn15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName  = scanner.next();

        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        System.out.println("Enter your age in year: ");
        int age = scanner.nextInt();

        System.out.println("Welcome " + firstName + " " + lastName + "! You are " + age + " seconds old!");

    }
}
