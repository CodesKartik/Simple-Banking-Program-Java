import java.util.Scanner;
public class reverseOfnum {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a no. to reverse it: ");
        num = scanner.nextInt();
        System.out.println("The reverse of num is: " + revNumber(num));
        scanner.close();
    }
    static int revNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
}
