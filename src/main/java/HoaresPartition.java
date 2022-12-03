import java.util.Arrays;

/**
 * Check Lomuto's Partion code first.
 * In Hoares Partition, the first element is the pivot point.
 * Idea: idea is to have two pointers low and high. (first and last),
 *       increment low till it sees an element greater than pivot,
 *       decrement high till it sees an element smaller than pivot.
 *       Swap the two elements:
 *       if low<high.
 *       else return.
 */
public class HoaresPartition {
    public static void main(String[] args) {
//        int[] arr = {70, 80, 30, 90, 40, 50, 10}; //expected outcome: [10, 80, 30, 90, 40, 50, 70]
//        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10}; // expected outcome: [1, 3, 2, 4, 5, 7, 8, 10]
        int[] arr = {5, 5, 5, 5}; //Note: the reason we start from -1 and lastIndex+1. And use do-while loop
                                  //      instead of simple while loop.
        hoaresPartition(arr, -1, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void hoaresPartition(int[] arr, int low, int high) {
        int pivotPointValue = arr[0];
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
                return;
            }
        }
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
