import java.util.ArrayDeque;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "{}([()])";
        if(balancedParentheses(str))
            System.out.println("True");
        else
            System.out.println("False");

    }

    public static boolean balancedParentheses(String str){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++){
            char current = str.charAt(i);

            if(current == '(' || current == '[' || current == '{')
            {
                stack.push(current);
//                System.out.println("after insert"+stack);
            }
            else{
                if(stack.isEmpty())
                    return false;
                else{
                    char poppedItem = stack.pop();
//                    System.out.println("Popped Item"+poppedItem);
                    if(!isMatching(poppedItem,current))
                        return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatching(char a, char b){
        return((a=='(' && b==')') ||
                (a=='{' && b=='}') ||
                (a=='[' && b==']'));
    }
}
