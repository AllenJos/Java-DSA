/**
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 *
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 *
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 */
public class CheckForRotations {
    public static void main(String[] args) {
        String s = "ABCD";
        String goal = "CDAB";
        System.out.println(areRotations(s, goal)); //expected outcome: true
    }

    private static boolean areRotations(String s, String goal) {

        if(s.length()!=goal.length())
            return false;

        return (s+s).contains(goal);
    }


}
