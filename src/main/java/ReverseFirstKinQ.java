import java.util.ArrayDeque;
import java.util.Queue;

//code to reverse the First K items in a Queue
public class ReverseFirstKinQ {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        //input: [10, 20, 30, 40, 50]
        //expected output: [20, 10, 30, 40, 50]
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        int k = 7;
        if(k>q.size())
            k%=q.size();

        reverseK(q,k);
    }

    //the idea is to use a stack where we poll and add the first k items of a Queue
    //then we pop these items from stack and add it to the end of the Queue
    //finally we poll and add (n-k) first elements of these Queue to get our desired Queue
    public static void reverseK(Queue<Integer> q, int k){
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if(k==0 || q.size()==0)
            return;

        for(int i=0; i<k;i++)
            stack.push(q.poll());

        for(int i=0; i<k; i++)
            q.offer(stack.pop());

        int remaining = q.size()-k;

        for(int i=0; i<remaining; i++)
            q.offer(q.poll());

        System.out.println(q);
    }
}
