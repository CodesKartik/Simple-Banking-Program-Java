
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i;
        int j;
        int mul;
        System.out.print("Enter the value i: ");
        i = scanner.nextInt();
        
        System.out.print("Enter the no for you multiplication table: ");
        j = scanner.nextInt();

        while (i < 11){
            mul = j * i;
            System.out.println(mul);
            i++;
        }

        scanner.close();
    }
}
