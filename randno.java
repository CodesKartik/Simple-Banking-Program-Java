import java.util.*;
public class randno {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        int st;
        int en;
        int num;
        System.out.println("The difference between the starting and ending point is not more than 5 or less than 4");
        System.out.print("Enter You starting point: ");
        st = scanner.nextInt();
        System.out.print("Enter You ending point: ");
        en = scanner.nextInt();
        System.out.println("---Your No. is randomly generated successfully guess it! ---");
        num = random.nextInt(st, en);
        System.out.print("It's your First attempt: ");
        int atp1 = scanner.nextInt();
        // First attempt
        if (atp1 == num){
            System.out.println("You found the no. in fist attempt: " + num);
            return;
        }
        else {
            System.out.println("You have 2 more attempt ");
        }
        System.out.print("It's your Second attempt: ");
        int atp2 = scanner.nextInt();
        // Second attempt
        if (atp2 == num){
            System.out.println("You find it " + num);
            return;
        }
        else{
            System.out.println("You have 1 more attempt ");
        }
        System.out.print("It's your Final attempt: ");
        int atp3 = scanner.nextInt();
        // Final attempt
        if (atp3 == num){
            System.out.println("You got it in final step: " + num);
        }
        else {
            System.out.println("Don't cry play again! ");
        }
        scanner.close();
    }
    
}
