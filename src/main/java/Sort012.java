import java.util.Arrays;

/**
 * You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s.
 * Write a solution to sort this array/list in a 'single scan'.
 * 'Single Scan' refers to iterating over the array/list just once or to put it in other words,
 * you will be visiting each element in the array/list just once.
 */
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 2, 0, 1}; //expected outcome: [0, 0, 0, 1, 1, 2, 2]
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] arr){
        //Your code goes here
        int i=-1, j=-1;
        for(int k=0; k<arr.length; k++){
            if(arr[k]==0){
                swapElements(arr, j+1, k);
                swapElements(arr, i+1, j+1);
                j++;
                i++;
            }else if(arr[k]==1){
                swapElements(arr, j+1, k);
                j++;
            }
        }

    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
