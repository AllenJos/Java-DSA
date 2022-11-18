
//Code to find the Peak element in an Array.
//this code uses the Binary Search concept
public class FindPeakElement {
    public static void main(String[] args) {
//        int[] arr = {5, 10, 20, 15, 7}; //expected outcome: index of element 20
        int[] arr = {10, 20, 25, 5, 23, 90, 67}; //expected outcome: index of elements 20 or 90
        System.out.println(findPeak(arr));
    }

    //idea is that if the mid element is smaller than the element on it's left, then there is surely a peak on it's left.
    //And the same goes for element on it's right.
    //Also first and last elements can be peaks too.
    private static int findPeak(int[] arr) {
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if((mid==0 || (arr[mid]>=arr[mid-1]))
                    && (mid==arr.length-1 || (arr[mid]>=arr[mid+1])))
                return mid;

            if(mid>0 && arr[mid]<=arr[mid-1])
                high=mid-1;
            else
                low=mid+1;
        }

        return -1;
    }
}
