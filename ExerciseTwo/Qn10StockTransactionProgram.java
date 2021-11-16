public class Qn10StockTransactionProgram {

    public static void main(String[] args) {

        int numberOfShares = 1000;
        double numberOfPricePurchasedPerShare = 32.87;
        double numberOfPriceSoldPerShareSold = 33.92;
        double amountBought = (numberOfShares * numberOfPricePurchasedPerShare);
        double commissionJoePaid = (amountBought * 0.02);
        double amountSold = (numberOfPriceSoldPerShareSold * numberOfShares);
        double commissionSold = (amountSold * 0.02);
        double amountLeft = (amountSold - amountBought - commissionJoePaid - commissionSold);

        System.out.println("The amount of money Joe paid for the stock is: " + amountBought + "\nThe amount of commission Joe paid his " +
                            "broker when he bought the stock is: " + commissionJoePaid + "\nThe amount that Joe sold the stock for is: " +
                            amountSold + "\nThe amount of commission Joe paid his broker when he sold the stock: " + commissionSold + "\nthe " +
                            "amount of money that Joe had left when he sold the stock and\n" +
                            "paid his broker (both times) is: " + amountLeft);
        if (amountLeft > 0) {
            System.out.println("Joe made a profit");

        } else {
            System.out.println("Joe made a loss");
        }


    }
}
