/**
 * You have been given an integer array/list(ARR) of size N.
 * It has been sorted(in increasing order) and then rotated by some number 'K'
 * in the right hand direction.
 * Your task is to write a function that returns the value of 'K', that means,
 * the index from which the array/list has been rotated.
 */
public class FindFirstElementInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4}; //expected outcome 2
        System.out.println(arrayRotateCheck(arr));
    }

    //Combination of 'Search in Rotated Array' and 'Find a Peak element problem'
    public static int arrayRotateCheck(int[] arr){
        //Your code goes here

        if(arr.length==0 || arr[0]<arr[arr.length-1]){
            return 0;
        }

        int low=0, high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;

            if((mid==0 || (arr[mid-1]>arr[mid])) && ((mid==arr.length-1) || (arr[mid+1]>arr[mid])))
                return mid;

            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
