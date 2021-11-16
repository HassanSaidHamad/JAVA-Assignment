import java.util.Scanner;

public class Qn3LandCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total square feet: ");
        int squareFeet = scanner.nextInt();

        int numberOfAcre = (squareFeet / 43560);
        System.out.println("The number of acres in the tract is: " + numberOfAcre);
    }

}
