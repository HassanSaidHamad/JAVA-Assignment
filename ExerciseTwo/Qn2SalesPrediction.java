import java.util.Scanner;

public class Qn2SalesPrediction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the projected amount of total sales: ");
        double amountTotalSale = scanner.nextInt();

        double profit = (amountTotalSale * 0.23);
        System.out.println("The profit that is made from your amount is: " + profit);

    }
}
