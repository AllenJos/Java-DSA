
//Important Coding Logic:
//Code to find the Max Sum of a Sub-array.
public class MaxSubArrSum {
    public static void main(String[] args) {
//        int[] arr = {2, 3, -8, 7, -1, 2, 3}; //expected outcome: 11
        int[] arr = {-5, 1, -2, 3, -1, 2, -2}; //expected outcome: 4
        int res = maxSubArrSum(arr);
        System.out.println(res);
    }

    private static int maxSubArrSum(int[] arr) {
        if(arr.length==0)
            return 0;

        //idea is to keep track of the max Ending Sum till the last element.
        //if (MaxEndingSum+current element) is greater than the value of current element, that is our new MaxEndingSum,
        //else we just begin a new MaxEndingSum with the current element.
        //And also we have to keep track of the MaxSum we have seen till now.
        int maxSum=arr[0];
        int maxEndingSum = maxSum;
        for(int i=1; i<arr.length; i++){
            maxEndingSum = Math.max(maxEndingSum+arr[i], arr[i]);
            maxSum = Math.max(maxEndingSum, maxSum);
        }

        return maxSum;
    }
}
