
//Important Code Logic: Implementing Window Sliding technique
//Code to find a SubArray with Given Sum. Given there are no negative Integers in the array.
public class SubArrWithGivenSum {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 20, 3, 10, 5}; //expected outcome: true
//        int sum = 33;
        int[] arr = {1, 4, 0, 0, 3, 10, 5}; //expected outcome: true
        int sum = 7;
//        int[] arr = {2, 4}; //expected outcome: false
//        int sum = 3;
        System.out.println(subArrWithGivenSum(arr, sum));
    }

    private static boolean subArrWithGivenSum(int[] arr, int sum) {
        if(arr.length==0)
            return false;

        int currEndingSum=0, k=0;
        for(int i=0; i<arr.length;i++){
            currEndingSum+=arr[i];
            k++;

            //if the currentEndingSum is smaller than the given sum. We don't do anything, and let the loop add the next i'th element.
            //but if the currentEndingSum is greater than the given sum. We reduce the window of size k till the sum becomes smaller or equal.
            if(currEndingSum>sum){
                while(currEndingSum>sum){
                    currEndingSum-=arr[i-k+1];
                    k--;
                }
            }

            //after reducing the window the currentEndingSum may have become equal. i.e. why we check this condition
            //only at the end.
            if(currEndingSum==sum) {
                return true;
            }
        }

        return false;
    }
}
