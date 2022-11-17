import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Code for finding number of Subsets in an array with Given sum. Recursive Solution
public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 2, 6}; //expected outcome: 2
        int givenSum = 8;
//        int[] arr = {10, 20, 15};   //expected outcome: 1
//        int givenSum = 25;
        System.out.println(subsetSum(arr, 0, givenSum, arr.length));
    }

    private static int subsetSum(int[] arr, int sum, int givenSum, int len) {
        //the sum is checked only at the last level of the recursion tree. So that all the subsets
        // can be checked
        if(len==0){
            return (sum==givenSum)? 1: 0;
        }

        //idea is to whether add the current element selected to the current sum or not recursively. (2 options)
        int currEl = arr[len-1];
        return ((subsetSum(arr, sum, givenSum, len-1)) + (subsetSum(arr, sum+currEl, givenSum, len-1)));
    }
}
