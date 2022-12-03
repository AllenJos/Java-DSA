import java.util.Arrays;

/**
 * You have been given a random integer array/list(ARR) of size N.
 * You have been required to push all the zeros that are present in the array/list to the end of it.
 * Also, make sure to maintain the relative order of the non-zero elements.
 * Don't use extra space.
 */
public class PushZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {5, 0, 7, 4, 8, 1, 3, 0, 7, 2, 0}; //expected outcome: [5, 7, 4, 8, 1, 3, 7, 2, 0, 0, 0]
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void pushZerosToEnd(int[] arr) {
        int i=0, k=0;
        //idea is to maintain k to keep track of the left array with all
        //elements greater than zero. i.e. till k-1 all elements are greater than zero.
        //when we find zero at i'th position swap it with k'th element.
        while(i<arr.length && k<arr.length){
            if(arr[i]!=0){
                swapElements(arr, i, k);
                k++;
            }
            i++;
        }
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
