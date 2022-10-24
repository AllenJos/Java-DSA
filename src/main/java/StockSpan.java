import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockSpan {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(60,10,20,40,35,30,50,70,65));
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50,40,30,20));

        //Printing span as 1 and pushing first index to the stack
        int span=1;
        stack.push(0);
        System.out.print(span+" ");

        //iterating over each element
        for(int i=1; i<list.size(); i++)
        {
            //checking if the stack is empty and if the current element is greater than or
            //equal to the top element in the stack(index) and popping if true
            while(!stack.isEmpty() && list.get(i)>=list.get(stack.peek()))
                    stack.pop();

            //checking if the stack is empty; if empty span is current index+1
            //if not empty then span is current index-top index in the stack
            span = stack.isEmpty()? i+1: i-stack.peek();
            System.out.print(span+" ");

            //pushing the current element's index to check
            //with the next element
            stack.push(i);
        }
    }
}

