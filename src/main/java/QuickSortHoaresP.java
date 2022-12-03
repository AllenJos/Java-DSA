import java.util.Arrays;

/**
 * Check Hoares partition code first.
 */
public class QuickSortHoaresP {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70}; //expected outcome: [10, 30, 40, 50, 70, 80, 90]
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low<high){
            int p = hoaresPartition(arr, low, high);
            quickSort(arr, low, p);
            quickSort(arr, p+1, high);
        }
    }

    private static int hoaresPartition(int[] arr, int low, int high) {
        int pivotPointValue = arr[low];
        low--;
        high++;
        while(true){
            do{
                low++;
            }while(arr[low]<pivotPointValue);
            do{
                high--;
            }while(arr[high]>pivotPointValue);
            if(low<high){
                swapElements(arr, low, high);
            }else{
                return high;
            }
        }
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
