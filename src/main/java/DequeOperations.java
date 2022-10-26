import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations {
    public static void main(String[] args) {
        MyDeque dq = new MyDeque();
        dq.insertMin(5);
        dq.insertMax(10);
        dq.insertMin(2);
        dq.insertMax(15);
        dq.getMin();
        dq.getMax();
        dq.insertMin(1);
        dq.getMin();
        dq.insertMax(20);
        dq.getMax();
    }
}

class MyDeque{
    Deque<Integer> dq;

    MyDeque(){
        dq = new ArrayDeque<>();
    }

    public void insertMin(int val){
        dq.offerFirst(val);
    }

    public void insertMax(int val){
        dq.offerLast(val);
    }

    public void getMin(){
        System.out.println(dq.peekFirst());
    }

    public void getMax(){
        System.out.println(dq.peekLast());
    }

    public void extractMin(){
        System.out.println(dq.pollFirst());

    }

    public void extractMax(){
        System.out.println(dq.pollLast());
    }
}
