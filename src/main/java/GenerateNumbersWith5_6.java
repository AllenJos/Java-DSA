import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumbersWith5_6 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("5");
        queue.offer("6");
        int n=12;

        for(int i=0; i<n; i++)
        {
            String current = queue.poll();
            System.out.print(current+" ");
            queue.offer(current+"5");
            queue.offer(current+"6");
        }
    }
}
