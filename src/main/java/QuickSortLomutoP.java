import java.util.Arrays;

/**
 * Code for Quick Sort algorithm using Lomuto Partition.
 * See code for LomutoPartition first.
 */
public class QuickSortLomutoP {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70}; //expected outcome: [10, 30, 40, 50, 70, 80, 90]
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low<high){
            int p = lPartition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    private static int lPartition(int[] arr, int l, int high) {
        int i=l-1; //i=-1, No elements in smaller elements window initially.
        for(int j=l; j<high; j++){
            if(arr[j]<arr[high]){
                i++;
                swapElements(arr, i, j);
            }
        }
        swapElements(arr, i+1, high);
        return i+1; //returning the index of pivot
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
