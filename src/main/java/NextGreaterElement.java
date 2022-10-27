import java.util.ArrayDeque;

//code to find the next Greater element of each element in the array (to the right of element in array)
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,7}; //expected output: 15 -1 12 12 12 -1 -1
//        int[] arr = {8,10,12};
//        int[] arr = {12,10,8};

        nextGreaterElement(arr);
    }

    //the idea is to use the code for Previous Greater element but only traverse the array from the end
    //refer Previous Greater element code for comments
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
