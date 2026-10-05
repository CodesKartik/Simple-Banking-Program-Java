import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        // Scanner class is used to take user input
        // Scanner calc = new Scanner(System.in);
        // // Operation Given for operations
        // System.out.println("Enter your operation (+, -, *, /): ");
        // char operator = calc.next().charAt(0);
        // // Taking the value from user for a & b
        // System.out.print("Enter first value: ");
        // double a = calc.nextDouble();
        // System.out.print("Enter the second value: ");
        // double b = calc.nextDouble();
        // double result;
        // // For Addition code
        // if(operator == '+'){
        //     result = a + b;
        //     System.out.println("Your answer is: " + result);
        // }
        // // For Subtraction code
        // if(operator == '-'){
        //     result = a - b;
        //     System.out.println("Your answer is: " + result);
        // }
        // // For Multiplication code
        // if(operator == '*'){
        //     result = a * b;
        //     System.out.println("Your answer is: " + result);
        // }
        // // For Division code
        // if(operator == '/'){
        //     result = a / b;
        //     System.out.println("Your answer is: " + result);
        // }
        Scanner calc  = new Scanner(System.in);
        // Operation Given for operations
        System.out.println("Enter your operation (+, -, *, /): ");
        char operator = calc.next().charAt(0);
        // Taking the value from user for a & b
        System.out.print("Enter first value: ");
        double a = calc.nextDouble();
        System.out.print("Enter the second value: ");
        double b = calc.nextDouble();
        double result;
        // For Addition code
        if(operator == '+'){
            result = a + b;
            System.out.println("Your answer is: " + result);
        }
        // For Subtraction code
        if(operator == '-'){
            result = a - b;
            System.out.println("Your answer is: " + result);
        }
        // For Multiplication code
        if(operator == '*'){
            result = a * b;
            System.out.println("Your answer is: " + result);
        }
        // For Division code
        if(operator == '/'){
            result = a / b;
            System.out.println("Your answer is: " + result);
        }
        
        calc.close();
    }
}
