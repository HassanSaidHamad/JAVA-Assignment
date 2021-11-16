import java.awt.event.ComponentAdapter;
import java.util.Scanner;

public class Qn4TotalPurchase {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);


        int subTotal = 0;
        double salesTax;
        double total;
        boolean shouldFinish = false;

        while (shouldFinish != true) {
            System.out.println("Enter the price of item 1: ");
            int item1 = scanner.nextInt();

            System.out.println("Enter the price of item 2: ");
            int item2 = scanner.nextInt();

            System.out.println("Enter the price of item 3: ");
            int item3 = scanner.nextInt();

            System.out.println("Enter the price of item 4: ");
            int item4 = scanner.nextInt();

            System.out.println("Enter the price of item 5: ");
            int item5 = scanner.nextInt();

            shouldFinish = true;

            subTotal = (item1 + item2 + item3 + item4 + item5);

        }

        System.out.println("The subtotal of the sale is: " + subTotal);

        salesTax = (subTotal * 0.06);
        System.out.println("The amount of sales tax is: " + salesTax);

        total = (subTotal + salesTax);
        System.out.println("The total cost is: " + total);

    }

}
