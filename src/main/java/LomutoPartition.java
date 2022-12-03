import java.util.Arrays;

/**
 * Code for Lomuto Partition:
 * Given a pivot element partition the given array, where left side of
 *  this element consists of smaller elements and right side contains greater elements, compared
 *  to the pivot element (we are given index of the pivot element).
 * Note: in LPartition we always consider that the pivot element is the last element in
 *       the array.
 * Idea: we slowly increase the index for smaller elements by swapping it with i+1
 *       The window of smaller elements will always be 0 to i and larger elements will be
 *       from i+1 to j-1(j is the current index point).
 *       And in the end just swap i+1'th element with the pivot element.
 *
 * Note: we can handle the case where pivot element is not the last element,
 *       simply by swapping the given pivot element with the last element in the array, before
 *       calling the lPartition method
 */
public class LomutoPartition {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70}; //expected outcome: [10, 30, 40, 50, 70, 90, 80]
        lPartition(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void lPartition(int[] arr, int l, int pivotElementIndex) {
        int i=l-1; //i=-1, No elements in smaller elements window initially.
        for(int j=l; j<pivotElementIndex; j++){
            if(arr[j]<arr[pivotElementIndex]){
                i++;
                swapElements(arr, i, j);
            }
        }
        swapElements(arr, i+1, pivotElementIndex);
    }

    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
