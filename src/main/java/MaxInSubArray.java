import java.util.ArrayDeque;

public class MaxInSubArray {
    public static void main(String[] args) {
//       int[] arr ={5, 6, 4, 8, 3, 7, 10, 12};
       int[] arr ={20, 10, 2, 3, 2 , 6, 17, 21, 23, 6};
       int k=4;
       maxInSubArray(arr, k);
    }

    public static void maxInSubArray(int[] arr, int k){
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //processing the first sub array
        for(int i=0; i<k; i++){
            //remove all indexes of elements from the end of dq which are smaller
            //than the current element at i
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
                dq.removeLast();

            //insert the current 'index' at the end
            dq.addLast(i);
        }

        for(int i=k; i<arr.length; i++){
            //the current first element in dq is the index of the
            //max element of the last window
            System.out.print(arr[dq.peekFirst()]+" ");

            //remove the indexes from the front which are not in
            //the current subarray
            while(!dq.isEmpty() && dq.peekFirst()<=i-k)
                dq.removeFirst();

            //remove all indexes of elements from the end of dq which are smaller
            //than the current element at i
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
                dq.removeLast();

            dq.addLast(i);
        }
        //the current first element in dq is the index of
        //the max element of the last subarray
        System.out.print(arr[dq.peekFirst()]+" ");
    }
}
