import java.util.Arrays;
import java.util.Collections;

//This code uses logic of Kadane's Algorithm
//code to find the longest SubArray with Even Odd pattern.
//Eg. 14 7 8 9...
public class LongestEvenOddSubArray {
    public static void main(String[] args) {
//        int[] arr = {10, 12, 14, 7, 8}; //expected outcome: 3
        int[] arr = {7, 10, 13, 14};  //expected outcome: 4
//        int[] arr= {10, 12, 8}; //expected outcome: 1
        System.out.println(longestEvenOddSubArray(arr));
//        Arrays.sort(arr, 1,3, Collections.reverseOrder());
//        for(int e: arr)
//            System.out.println(e);
    }

    private static int longestEvenOddSubArray(int[] arr) {
        int maxCount=1, count=1;
        for(int i=1; i<arr.length; i++){
            if((arr[i]+arr[i-1])%2==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }else {
                count=1;
            }
        }
        return maxCount;
    }

}
