import java.util.Scanner;

public class Qn7MilesPerGallon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of miles: ");
        double miles = scanner.nextDouble();

        System.out.println("Enter number of gas gallons: ");
        int gasGallons = scanner.nextInt();

        double MPG = (miles / gasGallons);
        System.out.println("A car’s miles-per-gallon (MPG) is: " + MPG);

    }
}
