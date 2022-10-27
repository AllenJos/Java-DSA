import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,15,10,20,8);
        int k=2;
        kLargestElements(list, k);
    }

    //Method to find k largest elements in the array using Min-Heap data structure
    //The idea is to implement a min heap which holds the first k elements
    //Then traversing from (k+1)th element and compare with the smallest element in the min heap
    //if smaller, then ignore. Else add it to the Min Heap. Doing this gives us a Heap which holds
    // the current k largest elements we have seen till now.
    public static void kLargestElements(List<Integer> list, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //add first k elements to the min-heap
        for(int i=0; i<k; i++)
            pq.add(list.get(i));

        //traverse from (k+1) and compare with the smallest element in the min-heap
        for(int i=k; i<list.size(); i++){
            //If current element in the array is larger than the current smallest element in the Min-Heap
            //then remove the smallest element from the Min-Heap and add the array element into it.
            if(list.get(i)>pq.peek())
            {
                pq.poll();
                pq.add(list.get(i));
            }
        }
        System.out.println(pq);
    }
}
