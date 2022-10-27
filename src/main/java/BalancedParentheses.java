import java.util.ArrayDeque;

//code to check if the Parentheses are balanced in a String.
public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "{}([()])"; //expected Output: True

        //method call returns True if paratheses are balanced
        if(balancedParentheses(str))
            System.out.println("True");
        else
            System.out.println("False");


    }

    public static boolean balancedParentheses(String str){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++){
            char current = str.charAt(i);

            //if we encounter any opening brackets we simply push it
            //into the stack
            if(current == '(' || current == '[' || current == '{')
            {
                stack.push(current);
//                System.out.println("after insert"+stack);
            }
            else{
                //we have to check if our stack is empty and return false if empty
                if(stack.isEmpty())
                    return false;
                else{
                    //we pop the current top element in our stack
                    char poppedItem = stack.pop();
//                    System.out.println("Popped Item"+poppedItem);
                    //the popped item is compared with our current item in String
                    //to see if they match and return false if not else ignore
                    if(!isMatching(poppedItem,current))
                        return false;
                }
            }
        }

        return stack.isEmpty();
    }

    //Method simply compares if the two parenthesis passes are pair or not
    public static boolean isMatching(char a, char b){
        return((a=='(' && b==')') ||
                (a=='{' && b=='}') ||
                (a=='[' && b==']'));
    }
}
