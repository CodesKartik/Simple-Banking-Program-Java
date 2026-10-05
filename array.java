public class array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        System.out.println("Original Array: ");
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        sum = sum + arr[i];
        }
        System.out.println("\n Length: " + arr.length);

        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
        System.out.println(sum);
    }
    
}
