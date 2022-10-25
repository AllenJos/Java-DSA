import java.util.ArrayDeque;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,7};
//        int[] arr = {8,10,12};
//        int[] arr = {12,10,8};

        nextGreaterElement(arr);
    }

    public static void nextGreaterElement(int[] arr){
        int next = -1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = next;
        stack.push(arr[n-1]);

        for(int i=n-2; i>=0; i--)
        {
            while(!stack.isEmpty() && arr[i]> stack.peek())
                stack.pop();

            next = stack.isEmpty()? -1: stack.peek();
            res[i] = next;
            stack.push(arr[i]);
        }

        for(int i=0; i<res.length; i++)
            System.out.print(res[i]+" ");
    }
}
