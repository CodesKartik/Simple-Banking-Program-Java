import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args) {
        // Compound interest calculator
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        
        System.out.print("Enter the rate of interest (in %): ");
        rate = scanner.nextDouble() / 100;
        
        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);
        System.out.printf("The compounded amount is: %f\n", amount);

        scanner.close();
    }
}