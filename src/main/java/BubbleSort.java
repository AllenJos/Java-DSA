import java.util.Arrays;

//Code implementing Bubble Sort
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 10, 3, 7, 6, 9}; //expected outcome: [2, 3, 5, 6, 7, 9, 10]
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swapElements(arr, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
