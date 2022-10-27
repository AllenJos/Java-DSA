import java.util.*;

//Given an array with n elements and a Sum
//code for finding the max items we can purchase from the array with the Sum given
public class PurchaseMaxItems {
    public static void main(String[] args) {
//        List<Integer> arr = Arrays.asList(20, 10, 5,30, 100);
        List<Integer> arr = Arrays.asList(111, 12, 5, 1, 200); //expected output: 2
        int sum=10;
        int items = purchaseMax(arr, sum);
        System.out.println(items);
    }

    //the idea is to use a Priority Queue which implements Min-Heap
    public static int purchaseMax(List<Integer> arr, int sum){
        if(arr.size()==0)
            return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(arr);//add all the elements from the list into the priority queue

        //Note: the Priority Queue holds the smallest element at the top by default
        //In short, the Priority Queue is an implementation of Min-Heap (by default)

        System.out.println(pq);

        int itemSum=0, itemCount=0;
        //check if the value of (itemSum+current smallest element) in
        //the priority queue is smaller than the sum
        while(itemSum+pq.peek()<=sum && pq.size()>0){
            //if yes then add it to the itemSum and remove it from the priority queue
            //and increment the itemCount
                itemSum += pq.poll();
                itemCount++;
        }
        return itemCount;
    }
}

