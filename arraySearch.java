
import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size; 
        int[] num;
        int target;
        
        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();

        scanner.nextLine();
        num = new int[size];

        System.out.print("Enter the targetted no.: ");
        target = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < num.length; i++){
            System.out.print("Enter the num in array: ");
            num[i] = scanner.nextInt();
        }

        for(int i = 0; i < num.length; i++){
            if(num[i] == target){
                System.out.println(target + " found at: " + i);
            }
            else{
                System.out.println("The targetted no. is not found");
            }
        }
        
        scanner.close();
    }
    
}
