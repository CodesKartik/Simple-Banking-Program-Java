import java.util.Scanner;
public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;
        int quantity;
        double cost;
        char currency = '$';
        double total;
        System.out.print("What are you buying?: ");
        item = scanner.nextLine();

        System.out.print("How much you are buying?: ");
        quantity = scanner.nextInt();

        System.out.print("What's the cost of each?: ");
        cost = scanner.nextDouble();

        total = cost * quantity;
        System.out.println("You have bought " + quantity + item + "/s");
        System.out.println("The total cost for " + quantity + " " + item + " is " + total + currency);

        scanner.close();
    }
    
}
