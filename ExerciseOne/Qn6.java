import java.util.Scanner;

public class Qn6 {
     
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter performance level: ");
        float performanceLevel = scanner.nextFloat();

        System.out.print("Enter performance level: ");
        float baseSalary = scanner.nextFloat();

        if (performanceLevel < 90) {

            System.out.println("Salary is: " + baseSalary);

        } else {

            double newSalary = (baseSalary * 0.03 + baseSalary);
            System.out.println("New Salary is: " + newSalary);

        }

    

    }


}