import java.util.Arrays;

//Simple code for InsertionSort
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12 ,5, 2, 10, 3, 7, 6, 9}; //expected outcome: [2, 3, 5, 6, 7, 9, 10, 12]
//        int[] arr = {1, 2, 3, 4};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }


}
