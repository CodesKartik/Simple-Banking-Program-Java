
import java.util.Scanner;

public class palindrome {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num = scanner.nextInt();
        int reverse = 0;
        int rem;
        int original = num;

        while (num > 0) {
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }   

        if (reverse == original) {
            System.out.printf("The no. %d is palindrome.", original);
        } else {
            System.out.printf("The no. %d is not palindrome.", original);
        }

        scanner.close();
    }
}
