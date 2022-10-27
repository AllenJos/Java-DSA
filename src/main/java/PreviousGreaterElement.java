import java.util.ArrayDeque;

//code to find the previous Greater element of each element in the array(to the left of element in array)
public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {15,10,18,12,4,6,2,8}; //expected output: -1 15 -1 18 12 12 6 12
//        int[] arr = {8,10,12};
//        int[] arr = {12,10,8};

        previousGreaterElement(arr);
    }

    //the idea is to maintain a stack of all the previous greater elements in a stack
    public static void previousGreaterElement(int[] arr){
        int prev = -1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(arr[0]);
        //the first element never has a Previous element so print -1 for first
        System.out.print(prev+" ");
        for(int i=1; i<arr.length; i++)
        {
            //keep popping all the elements in the stack which are smaller than the current array element
            //till we empty the stack or a larger element is found
            while(!stack.isEmpty() && arr[i]> stack.peek())
                stack.pop();

            //if stack is empty: no previous greater element was found
            //else the top of the stack has the previous greater of current element
            prev = stack.isEmpty()? -1: stack.peek();
            System.out.print(prev+" ");
            //always push the current array element into the stack
            //because this might be a greater element for the next array element
            stack.push(arr[i]);
        }
    }
}
