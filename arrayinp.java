import java.util.Scanner;
public class arrayinp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] food;
        food = new String[size];

        for(int i = 0; i < food.length; i++){
            System.out.print("Enter the food name: ");
            food[i] = scanner.nextLine();
        }
        for(String foods : food){
            System.out.println(foods);
        }

        scanner.close();
    }
    
}
