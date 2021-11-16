import java.util.Scanner;

public class Qn8TipTaxTotal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the charge for the food: ");
        int charges = scanner.nextInt();
        double tip = (charges * 0.15);
        double saleTax = (charges * 0.07);
        double total = (charges + tip + saleTax);

        System.out.println("The ampount Tip is: " + tip + "\nThe sales tax is: " + saleTax + "\nThe total cost is: " + total);
    }

}
