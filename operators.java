import java.util.*;
public class operators {
    public static void main(String[] args) {
        // for Addition
        // int a = 10;
        // int b = 20;
        // int c;
        // c = a + b;
        // System.out.println("Your answer is: " + c);
        // // for Subtraction
        // c = a - b;
        // System.out.println("Your answer is: " + c);
        // // for Multiplication
        // c = a * b;
        // System.out.println("Your answer is: " + c);
        // // for division
        // c = a / b;
        // System.out.println("Your answer is: " + c);


        // logical operator
        // Scanner log = new Scanner(System.in);
        // System.out.print("Enter you age: ");
        // int age = log.nextInt();
        // if (age >= 13 && age < 18){
        //     System.out.println("You are a Teenager.");
        // }
        // else if (age >= 18 && age <= 65){
        //     System.out.println("You are a Adult.");
        // }
        // else if (age >= 65 && age <= 95){
        //     System.out.println("You are a Senior Citizen");
        // }
        // else if (age > 100) {
        //     System.out.println("Go to death bed.... RIP......");
        // }

        // //Ternary operator ? = Return 1 of 2 Values if a condition is True

        // Variable = (condition) ? isTrue : ifFalse;

        // Scanner ternop = new Scanner(System.in);
        // int hrs;
        // System.out.print("Enter your Score: ");
        // hrs = ternop.nextInt();

        // String timeofday = (hrs < 12) ? "A.m " : "P.m";
        // System.out.println(timeofday);
        // ternop.close();

        // // Assignment operator

        int a;
        int b;
        int c;
        int d;

        Scanner op = new Scanner(System.in);

        a = op.nextInt();
        b = op.nextInt();
        c = op.nextInt();
        d = op.nextInt();
        c += a;
        d -= b;
        b *= a; 
        a %= b;
        b %= c;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        op.close();

    }

    
}
