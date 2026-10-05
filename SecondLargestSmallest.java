import java.util.Scanner;

public class SecondLargestSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        int larg = arr[0];
        int secondLarg = arr[0];

        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > larg) {
                secondLarg = larg;
                larg = arr[i];
            } 
            else if (arr[i] > secondLarg && arr[i] != larg) {
                secondLarg = arr[i];
            }
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } 
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLarg);
        System.out.println("Second Smallest = " + secondSmallest);

        sc.close();
    }
}