import java.util.Scanner;
public class method {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double num;
        System.out.print("Enter any num: ");
        num = scanner.nextDouble();
        
        System.out.printf("The square of %f is: %.2f\n", num, Square(num));
        System.out.printf("The cube of %f is: %.2f\n", num, Cube(num));

        scanner.close();
    }
    static double Square(double num)
    {
        return num * num;
    }
    static double Cube(double num)
    {
        return num * num * num;
    }
}
