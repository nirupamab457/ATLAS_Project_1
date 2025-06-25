import java.util.Arrays;

public class Task007 {

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            // Swap elements at start and end
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Original array
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Reverse the array
        reverse(arr);

        // Print reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
