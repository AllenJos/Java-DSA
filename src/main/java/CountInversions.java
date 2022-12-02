
//Code to find total number of inversions in an array.
//A pair (arr[i], arr[j]) forms an inversion when i<j and arr[i]>arr[j]
//This code uses Merge Sort to find the total inversions.
public class CountInversions {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5}; //expected outcome: 3
//        int[] arr = {40, 30, 20, 10}; //expected outcome: 6
        System.out.println(inversionsInAnArray(arr, 0, arr.length-1));;
    }

    //simple merge sort function, with the only difference that,
    //we are calculating inversions in its merge function
    private static int inversionsInAnArray(int[] arr, int low, int high) {
        if(low==high)
            return 0;
        int mid= low+(high-low)/2;
        int res = inversionsInAnArray(arr, low, mid) + inversionsInAnArray(arr, mid+1, high);
        return res+ countAndMerge(arr, low, high);
    }

    //This method is same as merge function in merge sort,
    //the only difference is a single line used to update res.(check comment on that line for explanation)
    private static int countAndMerge(int[] arr, int low, int high) {
        int mid= low+(high-low)/2;
        int left[] = new int[mid-low+1];
        int right[] = new int[high-mid];
        for(int i=0; i<left.length; i++){
            left[i] = arr[low+i];
        }
        for(int i=0; i<right.length; i++){
            right[i]=arr[mid+1+i];
        }
       int res=0, i=0, j=0, k=low;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
                res+= left.length-i;   //The idea is if right[j] is smaller than left[i] then, right[j] is going
                                       // to be smaller than all the elements on the right of left[i]
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
        return res;
    }
}
