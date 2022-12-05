import java.util.Arrays;

/**
 * Find the minimum difference between two elements in an array.
 * Idea: sort the array, then compare the difference of every adjacent elements,
 *       to find the smallest difference.
 */
public class MinDiffInArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 20, 12};
        System.out.println(minDiff(arr));
    }

    private static int minDiff(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            minDiff = Math.min(arr[i]-arr[i-1], minDiff);
        }
        return minDiff;
    }
}
