import java.util.Scanner;

public class Qn2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ? ");
        String name = scanner.next();

        System.out.println("How old are you ? ");
        int age = scanner.nextInt();

        System.out.print("Enter the name of a city: ");
        String nameOfCity = scanner.next();

        System.out.print("Enter the name of a college: ");
        String nameOfCollege = scanner.next();

        System.out.println("What is your profession: ?");
        String profession = scanner.next();

        System.out.println("What type of animal do you like: ?");
        String animal = scanner.next();

        System.out.println("What a pets name: ?");
        String petName = scanner.next();

        
        System.out.println("There once was a person named " + name + " who lived in " + nameOfCity + ". At the age of " + age + 
        ", " + name + " went to college at " + nameOfCollege + ". " + name + " graduated and went to work as a " + profession + 
        ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!");


    }
}