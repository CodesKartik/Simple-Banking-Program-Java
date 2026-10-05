import java.util.*;
public class RelationalOperator {
    public static void main(String[] args) {
        Scanner rel = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = rel.nextInt();
        System.out.print("Enter another value: ");
        int b = rel.nextInt();
        if (b == a){
            System.out.println("Equal");
        }
        else if (a < b){
            System.out.println("a is less than b: ");
        }
        else if (a > b) {
            System.out.println("a is greater then b: ");
        }
        else {
            System.out.println("Please enter a valid integer. ");
        }
        rel.close();
    }
    
}
