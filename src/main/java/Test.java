import java.util.*;

public class Test {
    public static void main(String[] args) {
//        Queue<Integer> q = new ArrayDeque<>();
//        q.offer(10);
//        q.offer(20);
//        q.offer(30);
//        q.offer(40);
//        q.offer(50);
//        int[] arr = {10,20,10,40};
//        List<Integer> s = new ArrayList(Arrays.asList(arr));
//        Iterator it = s.iterator();
//        while(it.hasNext())
//        {
//            System.out.print(" " +it.next());
//        }
//        int k = 3;
//        reverseK(q,k);
        int[] arr = {7,5,98,12,76,98};
        int l=0, n=6;
        int s=-1;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[l]){
                s=l;
                l=i;
            }else if(arr[l]>=arr[i] && s!=-1){
               if(arr[i]>arr[s])
                   s=i;
            }
        }

        System.out.println((s!=-1)? arr[l]+" "+arr[s]:arr[l]);

//        for(int i=0; i<n-1; i++){
//            System.out.print(arr[i]+" ");
//        }






//        System.out.println(pq);
    }

    public static void reverseK(Queue<Integer> q, int k){
        ArrayDeque<Integer> stack = new ArrayDeque<>();

    }
}
