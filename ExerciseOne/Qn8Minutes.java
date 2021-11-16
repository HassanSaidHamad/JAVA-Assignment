import java.util.Scanner;

public class Qn8Minutes {

    public static void main(String[] args) {

        int oneYear = 365;
        float oneYearMinutes = 525600;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the minutes: ");
        float minutes = scanner.nextInt();

        float numberOfYears = (minutes / oneYearMinutes );

        System.out.println("The number of years is: " + numberOfYears);

    }

}
