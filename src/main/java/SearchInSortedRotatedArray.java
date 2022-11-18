
//Code to search an element in a Sorted Rotated Array using Binary Search.
public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 500, 1000, 2000, 10, 20}; //expected outcome: 3
        System.out.println(searchInRotatedArray(arr, 10));
    }

    //idea: the idea is based on the observation that in a sorted rotated array, one half is always sorted,
    //      i.e., either the left half or the right half is in ascending order.
    private static int searchInRotatedArray(int[] arr, int element) {
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==element)
                return mid;

            if(arr[low]<arr[mid]){
                if(arr[low]<=element && element<=arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }else{
                if(arr[mid]<=element && element<=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
