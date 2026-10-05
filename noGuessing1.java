
import java.util.Random;
import java.util.Scanner;

public class noGuessing1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int firstNum;
        int secondNum;
        int num;
        int userNum;
        int mode;
        int diff;

        System.out.print("Enter your first no: ");
        firstNum = scanner.nextInt();

        System.out.print("Enter your second no: ");
        secondNum = scanner.nextInt();

        scanner.nextLine();

        System.out.println("---Your no. is randomly generated---");
        num = random.nextInt(firstNum, secondNum);

        System.out.println("Gamemodes are");
        System.out.println("1. Easy");
        System.out.println("2. Hard");
        System.out.print("Choose game mode: ");
        mode = scanner.nextInt();
        diff = secondNum - firstNum;

        if (mode == 1) {
            while (diff < 10) {
                System.out.println("Difference must be 10 or more.");
                System.out.println("Please enter the numbers again.");

                System.out.print("Enter your first no: ");
                firstNum = scanner.nextInt();

                System.out.print("Enter your second no: ");
                secondNum = scanner.nextInt();

                diff = secondNum - firstNum;
            }

            System.out.println("Easy mode selected");

        } else if (mode == 2) {

            while (diff < 25) {
                System.out.println("Difference must be 25 or more.");
                System.out.println("Please enter the numbers again.");

                System.out.print("Enter your first no: ");
                firstNum = scanner.nextInt();

                System.out.print("Enter your second no: ");
                secondNum = scanner.nextInt();

                diff = secondNum - firstNum;
            }

            System.out.println("Hard mode selected");

        } else {
            System.out.println("Invalid game mode");
        }
        System.out.print("Guess a no: ");
        userNum = scanner.nextInt();

        while (userNum != num) {

            if (userNum > num) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            System.out.print("Guess a no: ");
            userNum = scanner.nextInt();
        }

        System.out.println("Your guessed the no.");
        System.out.println("The no. is: " + userNum);

        scanner.close();
    }

}