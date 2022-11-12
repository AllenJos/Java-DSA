import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//Important: This code uses Prefix Sum Technique
//Code to find the Maximum Appearing element if two arrays with-
// -the first array as the starting range and the second array as the ending range is given
public class MaximumAppearingElement {
    public static void main(String[] args) {
        int[] left = {1, 2, 5, 15};    //expected Outcome:
        int[] right = {5, 8, 7, 18};   //       5

//        int[] left = {1, 2};     //expected Outcome:
//        int[] right = {5, 4};    //        2

        System.out.println(findMaxAppEl(left, right));
    }

    private static int findMaxAppEl(int[] left, int[] right) {
        int max=right[0];
        //We need to find the max value which can appear in the ranges.
        for(int i=1; i<right.length; i++){
            max = Math.max(max, right[i]);
        }
//        System.out.println("max" + max);

        //Adding all the starting ranges with 1 and ending range with -1 in a new array with size->(max+2)
        int[] arr = new int[max+2];
        for(int i=0; i<right.length; i++){
            arr[left[i]]++;
            arr[right[i]+1]--;
        }

        int res = Integer.MIN_VALUE;
        int resVal = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            arr[i]+=arr[i-1];
            if(res<arr[i]){
                res = arr[i];
                resVal = i; //indexes are the values in the ranges
            }
        }

        return resVal;
    }
}
