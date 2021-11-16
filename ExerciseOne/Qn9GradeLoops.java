import java.util.Scanner;

public class Qn9GradeLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean shouldFinished = false;
        while (shouldFinished != true ) {

            System.out.println("Enter Your ID No: ");
            int studentNo = scanner.nextInt();

            System.out.println("Enter Your Marks Score: ");
            float marks = scanner.nextFloat();

            if (marks >= 90) {
                System.out.println("A");

                System.out.println("Have you finished ? Press 1. Yes or 0. No");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    shouldFinished = true;
                }

                if (marks >= 90) {
                    count = count + 1;
                }

            } else if (marks >= 80) {
                System.out.println("B");

                System.out.println("Have you finished ? Press 1. Yes or 0. No");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    shouldFinished = true;
                }
                if (marks >= 90) {
                    count = count + 1;
                }

            } else if (marks >= 70) {
                System.out.println("C");

                System.out.println("Have you finished ? Press 1. Yes or 0. No");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    shouldFinished = true;
                }
                if (marks >= 90) {
                    count = count + 1;
                }

            } else if (marks >= 60) {
                System.out.println("D");

                System.out.println("Have you finished ? Press 1. Yes or 0. No");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    shouldFinished = true;
                }
                if (marks >= 90) {
                    count = count + 1;
                }

            } else {
                System.out.println("F");
                System.out.println("Have you finished ? Press 1. Yes or 0. No");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    shouldFinished = true;
                }
                if (marks >= 90) {
                    count = count + 1;
                }
            }

//            System.out.println("The number of the students who got an A is: " + count);
        }

        System.out.println("The number of the students who got an A is: " + count);

    }
}
