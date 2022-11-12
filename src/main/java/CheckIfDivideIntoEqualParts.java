
//Important: Implementing Prefix Sum Technique
//Code to check if we can divide the array into three equal parts with equal sum.
public class CheckIfDivideIntoEqualParts {
    public static void main(String[] args) {
//        int[] arr = {5, 2, 6, 1, 1, 1, 1, 4}; //expected outcome: true
        int[] arr = {3, 2, 5, 1, 1, 5}; //expected outcome: false
        System.out.println(checkDivide(arr));
    }

    private static boolean checkDivide(int[] arr) {
        int totalSum=0;
        for(int i=0; i<arr.length;i++)
            totalSum+=arr[i];

        int[] prefixSum = new int[arr.length];
        int[] suffixSum = new int[arr.length];

        prefixSum[0] = 0;
        for(int i=1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1]+arr[i-1];
        }

        suffixSum[arr.length-1] = 0;
        for(int i=arr.length-2; i>=0; i--){
            suffixSum[i] = suffixSum[i+1]+arr[i+1];
        }

        int i=0, pi=0, si=arr.length-1;
        while(i<arr.length){
            if(pi==si)
                break;
            //the important logic part
            if(prefixSum[pi]==suffixSum[si] && totalSum-prefixSum[pi]-suffixSum[si]==prefixSum[pi]){
                return true;
            }else if(prefixSum[pi]<suffixSum[si]){
                pi++;
            }else{
                si--;
            }

        }

        return false;
    }
}
