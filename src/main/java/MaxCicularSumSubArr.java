
//Important Code logic: using Kadane's Algorithm
//Code to find Max Sum in a Circular SubArr
public class MaxCicularSumSubArr {
    public static void main(String[] args) {
//        int[] arr = {8, -4, 3, -5, 4}; //expected outcome: 12
//        int[] arr = {5, -2, 3, 4}; //expected outcome: 12
//        int[] arr = {2, 3, -4}; //expected outcome: 5
        int[] arr = {3, -4, 5, 6, -8, 7}; //expected outcome: 17
        System.out.println(maxCircSum(arr));
    }

    //the idea: What do we observe about the middle part in all the sample inputs?
    //the middle part is actually the Minimum Sum SubArr. If we reduce this sum from the total sum of the Array. We get the Max Sum of Cicular SubArr.
    //So the code is divided into two parts:
    //1st we find the Normal Max Sum SubArray.
    //2nd we find the minimum Sum SubArray, so that we can find the Max Sum Circular
    //Then we return the max out of these two Sums. Voilà!
    private static int maxCircSum(int[] arr) {
        int res=0;

        //Using Kadane's Algorithm to find the Normal Max Sum SubArray
        int maxEndingSum=arr[0];
        int normalMaxSum=maxEndingSum;
        for(int i=1; i<arr.length; i++){
           maxEndingSum = Math.max(maxEndingSum+arr[i], arr[i]);
           normalMaxSum = Math.max(maxEndingSum, normalMaxSum);
        }

        //Using Kadane's to find the Normal Min Sum SubArray
        int minEndingSum=arr[0];
        int normalMinSum = minEndingSum;
        for(int i=1; i<arr.length; i++){
            minEndingSum = Math.min(minEndingSum+arr[i], arr[i]);
            normalMinSum = Math.min(minEndingSum, normalMinSum);
        }

        //Subtracting the Normal Min Sum SubArray from the total Sum of Array
        //to get the Max Sum in Circular SubArray
        int totalSum=0;
        for(int i=0; i<arr.length; i++){
            totalSum+=arr[i];
        }
        int maxSumCircSubArr = totalSum - normalMinSum;

//        System.out.println(normalMaxSum +" "+ normalMinSum+" "+totalSum+" ");
        //Now we return the max out of Normal Max Sum SubArray and Max Sum in Circular SubArray
        return Math.max(maxSumCircSubArr, normalMaxSum);
    }
}
