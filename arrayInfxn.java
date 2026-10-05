
import java.util.Arrays;

public class arrayInfxn {
        
    public static void main(String[] args) {

        // Original array
        int[] arr = {50, 20, 40, 10, 30};

        // 1. length
        System.out.println("Length: " + arr.length);

        // 2. Arrays.toString()
        System.out.println("Array: " + Arrays.toString(arr));

        // 3. Arrays.sort()
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        // 4. Arrays.copyOf()
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copy: " + Arrays.toString(copy));

        // 5. Arrays.copyOfRange()
        int[] range = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Range: " + Arrays.toString(range));

        // 6. Arrays.equals()
        int[] arr2 = {10, 20, 30, 40, 50};

        System.out.println("Arrays equal: " + Arrays.equals(arr, arr2));

        // 7. Arrays.fill()
        int[] fillArray = new int[5];

        Arrays.fill(fillArray, 100);

        System.out.println("Filled array: " + Arrays.toString(fillArray));

        // 8. Arrays.fill() with range
        int[] fillRange = {1, 2, 3, 4, 5};

        Arrays.fill(fillRange, 1, 4, 99);

        System.out.println("Fill range: " + Arrays.toString(fillRange));

        // 9. Arrays.binarySearch()
        int index = Arrays.binarySearch(arr, 30);

        System.out.println("Index of 30: " + index);

        // 10. Arrays.compare()
        int result = Arrays.compare(arr, arr2);

        System.out.println("Compare result: " + result);

        // 11. Arrays.mismatch()
        int mismatchIndex = Arrays.mismatch(arr, arr2);

        System.out.println("Mismatch index: " + mismatchIndex);
    }
}
