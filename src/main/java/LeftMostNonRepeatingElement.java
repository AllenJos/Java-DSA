import java.util.Arrays;

/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 *
 */
public class LeftMostNonRepeatingElement {
    public static void main(String[] args) {
        String str = "geeksforgeeks"; //expected outcome: 5
//        String str = "abcabde"; //expected outcome: 2
//        String str = "abc"; //expected outcome: 0
//        String str = "abcabc"; //expected outcome: -1
//        String str = "leetcode"; //expected outcome: 0
        System.out.println(nonRepeatingEl(str));
    }

    private static int nonRepeatingEl(String str) {
        int res=Integer.MAX_VALUE; //max value, because we have to use Math.min(res, )
        int[] position = new int[256];
        Arrays.fill(position, -1);
        for(int i=str.length()-1; i>=0; i--){
           if(position[str.charAt(i)]==-1) {
               //if the position of current element is -1,
               //then it has been not repeated yet.
               position[str.charAt(i)] = i;
           }
           else {
               //else this has repeated and we don't want to use or compare it again
               //therefore marking with MAX_VALUE
               //By doing this we will only have positions of non-repeating elements in
               //the position array.
               position[str.charAt(i)] = Integer.MAX_VALUE;
           }
        }

        //traversing through the position array is still considered one traversal solution
        //now we just have to find whose position is smallest.
        for(int i=0; i<position.length; i++){
            if(position[i]>=0){
                res = Math.min(res, position[i]);
            }
        }

        return (res!=Integer.MAX_VALUE)? res: -1;
    }
}
