/**
 * Find the left most element in a string,
 * which is repeating.
 */
public class LeftMostRepeatingElement {
    public static void main(String[] args) {
//        String str = "geeksforgeeks"; //expected outcome: 0
        String str = "abccbd"; //expected outcome: 1
//        String str = "abc"; //expected outcome: -1
        System.out.println(repeatingEl(str));
    }

    private static int repeatingEl(String str) {
        int res=-1;

        //array to keep track of the positions of all characters
        int[] position = new int[256];
        //Note: we are using 1 based indexing. So that we can keep res as -1.
        for(int i=0; i<str.length(); i++){

            if(position[str.charAt(i)-'a']!=0){
                //if the position of current element is not 0, then this element is repeating
                if(res==-1){
                    //if res is -1, then this element is the first to repeat
                    res=i+1;
                }else{
                    //else we already have seen another element repeat,
                    //so we need to find which element was the first to come.
                    //And update the first one's position in res.
                    res = Math.min(res, position[str.charAt(i)-'a']);
                }
            }else{
                //this means the current element is being seen for the first time,
                //we only update the position of any element in this case
                position[str.charAt(i)-'a']=i+1;
            }
        }

        //if no element has repeated send -1,
        //else the correct index, since we are using 1 based indexing.
        return (res==-1)? -1: res-1;
    }
}
