
//Binary Searching for the first index of an element in a Sorted Array.
public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 15, 17, 20, 20, 20, 20};
        System.out.println(firstIndex(arr, 20)); //expected outcome: 5
        System.out.println(firstIndex(arr, 10)); //expected outcome: 1
    }

    private static int firstIndex(int[] arr, int element) {
        int low=0, high = arr.length-1;
        int mid=-1;

        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==element){
                //this whole code is same as Binary Search with just one change:
                //if we encounter the element we just check the element on it's left,
                //that whether that element is also the element we are looking for.
                if(arr[mid-1]==element)
                    high=mid-1;
                else
                    return mid;
            }
            else if(arr[mid]>element)
                high=mid-1;
            else
                low=mid+1;
        }

        return -1;
    }

}
