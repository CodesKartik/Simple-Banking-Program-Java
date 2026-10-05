import java.util.Scanner;

// Write a java program for an online shopping system create a method name place order 
// with 2 parameters and avaliable stock and quantity that throw an IllegalArgumentExceptionwhen
//  when the requested quantity is less then equal to 0 or exceeds available stock handle the exception
//  in main method display the order status finall pass a completed messsage in finally block

public class orderStatustask {

    public static void placeOrder(int availableStock, int quantity) {
        if (quantity <= 0 || quantity > availableStock) {
            throw new IllegalArgumentException(
                    "Quantity must be at least 10 and cannot exceed available stock.");
        }

        System.out.println("Order placed successfully for " + quantity + " item(s).");
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the quantity you want: ");
        int quantity = scanner.nextInt();

        try {
            placeOrder(50, quantity);
            System.out.println("Order status: Confirmed");
        } catch (IllegalArgumentException e) {
            System.out.println("Order status: Failed");
            System.out.println("Reason: " + e.getMessage());
        } finally {
            System.out.println("Order processing completed.");
        }
        scanner.close();
    }
}
