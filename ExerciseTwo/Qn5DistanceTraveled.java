import java.util.Scanner;

public class Qn5DistanceTraveled {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter Speed/Miles: ");
//        int speed = scanner.nextInt();

        System.out.println("Enter Time/Hours: ");
        int time = scanner.nextInt();

        int distance = (60 * time);
        System.out.println("The distance the car will travel in " + time + " hours is: " + distance);


    }
}
