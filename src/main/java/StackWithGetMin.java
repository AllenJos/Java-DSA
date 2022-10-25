import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

class StackWithGetMin{
    public static void main(String[] args) {
//        if(-1024==-1024)
//            System.out.println("Hello");
        MinStack obj = new MinStack();
        String[] arr = {"push","push","push","push","pop","getMin","pop","top","getMin","pop","getMin"};
        int getMin,top,val;
        for (String s : arr) {

            switch (s) {
                case "push":
                    Scanner sc = new Scanner(System.in);
                    val = sc.nextInt();
                    obj.push(val);
                    break;
                case "pop":
                    obj.pop();
                    break;
                case "getMin":
                    getMin = obj.getMin();
                    System.out.println("Min" + getMin);
                    break;
                default:
                    top = obj.top();
//                System.out.println("Top"+top);
                    break;
            }
        }
    }
}
class MinStack {
    ArrayDeque<Integer> mainStack;
    ArrayDeque<Integer> auxStack;
    public MinStack() {
        mainStack = new ArrayDeque<>();
        auxStack = new ArrayDeque<>();
    }

    public void push(int val) {
        if(mainStack.isEmpty())
        {
            mainStack.push(val);
            auxStack.push(val);
        }
        else{
            mainStack.push(val);

            if(mainStack.peek()<=auxStack.peek())
                auxStack.push(val);

            System.out.println("MS"+mainStack);
            System.out.println("AS"+auxStack);
        }
    }

    public void pop() {
        if(mainStack.isEmpty() && auxStack.isEmpty())
            return;
        System.out.println("pop peek"+mainStack.peek()+" aux "+auxStack.peek());
        assert mainStack.peek() != null;
        if(mainStack.peek().equals(auxStack.peek())) {
            System.out.println(auxStack.peek());
            auxStack.pop();
//            System.out.println("Auxpop"+val);
        }

        mainStack.pop();
//        System.out.println("mpop"+val2);
        System.out.println("POP MS"+mainStack);
        System.out.println("POP AS"+auxStack);
    }

    public Integer top() {
        if(mainStack.isEmpty())
            return null;
        System.out.println("top"+mainStack.peek());
        return mainStack.peek();
    }

    public Integer getMin() {
        if(auxStack.isEmpty())
            return null;
        return auxStack.peek();
    }
}
