import java.util.ArrayDeque;
import java.util.Queue;

//code to generate first n numbers containing two given digits
//using the concept level order traversal using the Queue data structure
public class GenerateNumbersWith5_6 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("5");
        queue.offer("6");
        int n=10;
        //expected output: 5 6 55 56 65 66 555 556 565 566
        for(int i=0; i<n; i++)
        {
            String current = queue.poll();
            System.out.print(current+" ");
            queue.offer(current+"5");
            queue.offer(current+"6");
        }
    }
}
