import java.util.Arrays;

//Simple code implementing SelectionSort
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12 ,5, 2, 10, 3, 7, 6, 9}; //expected outcome: [2, 3, 5, 6, 7, 9, 10, 12]
//        int[] arr = {1, 2, 3, 4};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int minElIndex = i;
            for(int j=i; j<arr.length; j++){
               minElIndex = (arr[j]<arr[minElIndex])? j: minElIndex;
            }
            swapElements(arr, i, minElIndex);
        }

        System.out.println(Arrays.toString(arr));;
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
