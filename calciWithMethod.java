import java.util.Scanner;
public class calciWithMethod {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double num1;
        double num2;
        int choice;
        boolean isrunning = true;

        while (isrunning) {
            System.out.println("********************");
            System.out.println("Calculator Program");
            System.out.println("********************");

            System.out.print("Enter the first no.: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the Second no.: ");
            num2 = scanner.nextDouble();

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter the choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 ->
                    System.out.println("Result is: " + Addition(num1, num2));
                case 2 ->
                    System.out.println("Result is: " + Subtraction(num1, num2));
                case 3 ->
                    System.out.println("Result is: " + Multiplication(num1, num2));
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Can't divide with with Zero(0)");
                    } else {
                        System.out.println("Result is: " + Division(num1, num2));
                    }

                }
                case 5 ->
                    isrunning = false;
                default ->
                    System.out.println("Please enter a valid choice");

            }
        }

        scanner.close();
    }

    static double Addition(double n1, double n2) {

        return n1 + n2;
    }

    static double Subtraction(double n1, double n2) {

        return n1 - n2;
    }

    static double Multiplication(double n1, double n2) {

        return n1 * n2;
    }

    static double Division(double n1, double n2) {

        return n1 / n2;
    }

}
