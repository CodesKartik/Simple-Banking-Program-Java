
import java.util.Random;
import java.util.Scanner;

public class noGuessing {

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

        System.out.println("Gamemodes are");
        System.out.println("1. Easy");
        System.out.println("2. Hard");
        System.out.print("Choose game mode: ");
        mode = scanner.nextInt();
        diff = secondNum - firstNum;
        while (mode != 1 && mode != 2) {
            System.out.println("Invalid game mode!");
            System.out.println("Please select 1 or 2.");

            System.out.print("Choose game mode: ");
            mode = scanner.nextInt();
        }

        if (mode == 1) {
            if (diff >= 10) {
                System.out.println("Easy mode selected");
            } else {
                System.out.println("Difference is not morethen 10");
                System.out.println("Can't able to select mode");
                while (diff < 10) {
                    System.out.print("Enter your first no: ");
                    firstNum = scanner.nextInt();

                    System.out.print("Enter your second no: ");
                    secondNum = scanner.nextInt();

                    diff = secondNum - firstNum;
                }
            }

        } else if (mode == 2) {
            if (diff >= 25) {
                System.out.println("Hard mode selected");
            } else {
                System.out.println("Difference is not morethen 25");
                System.out.println("Can't able to select mode");
                while (diff < 25) {
                    System.out.print("Enter your first no: ");
                    firstNum = scanner.nextInt();

                    System.out.print("Enter your second no: ");
                    secondNum = scanner.nextInt();

                    diff = secondNum - firstNum;
                }
            }
        }
        else {
            System.out.println("Invalid game mode");
        }

        System.out.println("---Your no. is randomly generated---");
        num = random.nextInt(firstNum, secondNum);

        System.out.print("Guess a no: ");
        userNum = scanner.nextInt();
        while (userNum != num) {
            System.out.print("Guess a no: ");
            userNum = scanner.nextInt();
        }
        System.out.println("Hurray! guessed the no");
        System.out.println("The no. is: " + userNum);

        scanner.close();
    }

}
