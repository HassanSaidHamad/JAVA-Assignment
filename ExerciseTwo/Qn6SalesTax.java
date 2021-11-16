import java.util.Scanner;

public class Qn6SalesTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of a purchase: ");
        int purchase = scanner.nextInt();
        System.out.println("The amount of purchase is: " + purchase);

        double stateSalesTax = (purchase * 0.04);
        System.out.println("the state sales tax is: " + stateSalesTax);

        double countrySalesTax = (purchase * 0.02);
        System.out.println("The county sales tax is: " + countrySalesTax);

        double totalSalesTax = (stateSalesTax + countrySalesTax);
        System.out.println("The total sales tax is: " + totalSalesTax);

        double totalOfTheSale = (purchase + totalSalesTax);
        System.out.println("Tnd the total of the sale is: " + totalOfTheSale);

    }

}
