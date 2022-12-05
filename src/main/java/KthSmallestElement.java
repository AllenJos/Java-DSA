/**
 * Code to find out the k'th smallest element in an unsorted array.
 * Idea: using lomuto partition to find out the correct position of a pivot,
 *       then compare the position with k to decide the next pivot element.
 */
public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 12};
        int k=2;
        System.out.println(kthElement(arr, k));
    }

    private static int kthElement(int[] arr, int k) {
        int low=0, high=arr.length-1;
        while(low<=high){
            int p = lPartition(arr, low, high);
            if(p==k-1){
                return arr[p];
            }else if(p<k-1){
                low=p+1;
            }else{
                high=p-1;
            }
        }
        return -1;
    }

    private static int lPartition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                swapElements(arr, i, j);
            }
        }
        swapElements(arr, high, i+1);
        return i+1;
    }


    private static void swapElements(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
