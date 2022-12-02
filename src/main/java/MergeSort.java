import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12 ,5, 2, 10, 3, 7, 6, 9}; //expected outcome: [2, 3, 5, 6, 7, 9, 10, 12]
//        int[] arr = {1, 2, 3, 4};
        mergeSortImpl(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortImpl(int[] arr, int low, int high) {
        if(low==high)
            return;
//        int mid = (low+high)/2; //this may result in overflow in really large arrays.
        int mid = low + (high-low)/2;

        mergeSortImpl(arr, low, mid);
        mergeSortImpl(arr, mid+1, high);

        mergeArrays(arr, low, mid,  high);

    }

    private static void mergeArrays(int[] arr, int low, int mid, int high) {
      int left[] = new int[mid-low+1];
      int right[] = new int[high-mid];
      for(int i=0; i<left.length; i++){
          left[i] = arr[low+i];
      }
      for(int i=0; i<right.length; i++){
          right[i] = arr[mid+1+i];
      }
      int i=0, j=0, k=low;
      while(i<left.length && j<right.length){
          if(left[i]<right[j]){
              arr[k++]=left[i++];
          }else{
              arr[k++]=right[j++];
          }
      }
      while(i<left.length){
          arr[k++]=left[i++];
      }
      while(j<right.length){
          arr[k++]=right[j++];
      }
    }
}
