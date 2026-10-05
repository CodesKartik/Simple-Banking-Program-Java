import java.util.*;
public class Conditions{
    static Scanner calc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the value for a: ");
        int a = calc.nextInt();
        System.out.print("Enter the value for b: ");
        int b = calc.nextInt();
        int diff = 5;
        if (a - b == diff){
            System.out.println("Your ans is " + diff);
        }
        else{
            System.out.println("Your are wrong! ");
        }
    }
}
