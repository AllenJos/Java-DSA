
//Code to find the Maximum sum of K Consecutive Elements in an Array.
public class SlidingWindowTechnique {
    public static void main(String[] args) {
//        int[] arr = {1, 8, 30, -5, 20, 7}; //expected outcome: 45
//        int k=3;
        int[] arr = {5, -10, 6, 90, 3}; //expected outcome: 96
        int k=2;
        System.out.println(maxSum(arr, k));
    }

    //This method implements Sliding Window Technique
    private static int maxSum(int[] arr, int k) {
        int currSum=0;
        for(int i=0; i<k; i++){
            currSum+=arr[i];
        }

        int maxSum = currSum;
        for(int i=k; i<arr.length; i++){
            currSum = currSum+arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
