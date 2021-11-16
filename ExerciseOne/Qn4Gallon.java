import java.util.Scanner;

public class Qn4Gallon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of gallons: ");
        float numberOfGallonsOfGas = scanner.nextFloat();

        System.out.print("Please enter number of miles per gallon: ");
        float numberOfMilesPerGallon = scanner.nextFloat();

        System.out.print("Please enter price of gas per gallon: ");
        float gasPrice = scanner.nextFloat();

        double miles = (numberOfGallonsOfGas * numberOfMilesPerGallon / 1);
        double costingOfMiles = (numberOfMilesPerGallon / numberOfGallonsOfGas * gasPrice);
        System.out.println("The far (in miles) the car can travel with the gas is: " + miles + "\nThe cost of travelling 250 miles with the car is: "
                    + costingOfMiles);

    }
}
