//code to find the Max Difference between two elements in an array.
//Note: the larger element should be on the right side of the smallest element.
public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 4, 8, 1}; //expected outcome: 8
                                         // -> (10-2).
        int diff = findMaxDiff(arr);
        System.out.println(diff);
    }

    private static int findMaxDiff(int[] arr) {
        if(arr.length==0 || arr.length==1)
            return 0;

        //we have to keep track of the current smallest element and the Max difference seen till now.
        int res=arr[0]-arr[1];
        int smallest = arr[0];
        for(int i=1; i<arr.length; i++){
           res = Math.max(res, arr[i]-smallest);
           smallest = Math.min(smallest, arr[i]);
        }
        return res;
    }
}
