import java.util.Arrays;

/**
 * You have been given a random integer array/list(ARR) of size N.
 * Write a function that rotates the given array/list by D elements(towards the left).
 */
public class RotateArrayByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; //expected outcome: [3, 4, 5, 6, 7, 1, 2]
        int d=2;
        rotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int d) {
        //Your code goes here
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);

    }

    public static void reverse(int[] arr, int low, int high){
        while(low<high){
            swapElements(arr, low, high);
            low++;
            high--;
        }
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
