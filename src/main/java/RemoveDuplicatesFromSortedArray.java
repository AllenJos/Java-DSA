
//Code to remove Duplicates from a sorted array in O(n) time.
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 40, 40, 50}; //Expected Outcome: 10 20 30 40 50
        int size = removeDuplicates(arr);
        for(int i=0; i<=size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        if(arr.length==0)
            return 0;
        int size=0;

        //the trick is to introduce a variable 'size' which is the current size of array
        //with unique elements, which is only incremented when element at i is not equal to element at i-1
        //and also we copy this particular i'th element to index (size+1)
        //and return this variable 'size' in the end.
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[size+1]=arr[i];
                size++;
            }
        }
        return size;
    }
}
