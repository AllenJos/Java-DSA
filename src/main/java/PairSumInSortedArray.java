
//Code for Pair Sum Problem with Two Pointer Approach.
//Note: This technique is good if the given array is sorted. Otherwise hashing is the best approach.
public class PairSumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 30};
        System.out.println(pairSum(arr, 17));
    }

    private static boolean pairSum(int[] arr, int sum) {
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum)
                return true;

            //idea: if the current sum is greater than the given sum, then move the right pointer.
            //      else move the left pointer.
            if(arr[i]+arr[j]>sum)
                j--;
            else
                i++;
        }

        return false;
    }
}
