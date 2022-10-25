import java.util.ArrayDeque;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {15,10,18,12,4,6,2,8};
//        int[] arr = {8,10,12};
//        int[] arr = {12,10,8};

        previousGreaterElement(arr);
    }

    public static void previousGreaterElement(int[] arr){
        int prev = -1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(arr[0]);
        System.out.print(prev+" ");
        for(int i=1; i<arr.length; i++)
        {
            while(!stack.isEmpty() && arr[i]> stack.peek())
                stack.pop();

            prev = stack.isEmpty()? -1: stack.peek();
            System.out.print(prev+" ");
            stack.push(arr[i]);
        }
    }
}
