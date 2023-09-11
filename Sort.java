import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = { 1, 45, 60, 32, 18, 3, 10 };

        // Sort the array
        Arrays.sort(a);

        // Print the sorted array
        System.out.println("Sorted Array: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}