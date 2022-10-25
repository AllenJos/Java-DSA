import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseFirstKinQ {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
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
