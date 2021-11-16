import java.util.Scanner;

public class Qn3 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of participant: ");
        int numberOfparticipant = scanner.nextInt();

        int revenue = 2500 * numberOfparticipant;
        System.out.println("The total revenue that company will generate is: " + revenue);
    }

}