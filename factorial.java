import java.util.Scanner;
public class factorial {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double num;
        System.out.print("Enter the num for finding factorial: ");
        num = scanner.nextDouble();
        System.out.println("The factorial is: " + fact(num));
        
        scanner.close();
    }
    static double fact(double num){
        if(num == 1 || num == 0){
            return 1;
        }else{
            return num * fact(num - 1);
        }
    }
}
