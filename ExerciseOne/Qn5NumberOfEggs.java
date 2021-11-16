import java.util.Scanner;

public class Qn5NumberOfEggs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many eggs do have ?");
        int noOfEggs = scanner.nextInt();

//        int dozen = (noOfEggs / 12);
//        int noOfEggsLeft = (noOfEggs % 12);
//        System.out.println("You have " + dozen + "dozen of your egges. \n" + noOfEggsLeft + " are your extra eggs that are left over.");

        int gross = (noOfEggs / 144);
//        int grossDozen = (gross * 144 - noOfEggs);
        int grossDozen = (noOfEggs-gross * 144);
        System.out.println(grossDozen);
        int grossLeftOver = (grossDozen / 12 * 12 - grossDozen);

        System.out.println("Your number of eggs is: " + gross + " gross. \nYou have: " + grossDozen / 12 + " dozens. \nAnd: " + grossLeftOver
                + " eggs are left over.");
    }
}
