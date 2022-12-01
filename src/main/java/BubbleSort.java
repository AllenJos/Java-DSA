import java.util.Arrays;

//Code implementing Bubble Sort which has been optimized, in case,
// the array gets sorted midway or is already sorted.
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12 ,5, 2, 10, 3, 7, 6, 9}; //expected outcome: [2, 3, 5, 6, 7, 9, 10, 12]
//        int[] arr = {1, 2, 3, 4};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swapElements(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
