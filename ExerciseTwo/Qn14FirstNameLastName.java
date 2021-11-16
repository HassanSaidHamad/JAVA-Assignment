import java.util.Scanner;

public class Qn14FirstNameLastName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName  = scanner.next();

        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        System.out.println("Welcome " + firstName + " " + lastName + "!");

    }

}
