/**
 * Code to check if a given string is subsequence of another given string.
 * Note: subsequence and substrings are different
 */
public class CheckIfStringIsSubSeq {
    public static void main(String[] args) {
        String str = "ABCD";
        String sub = "ACD";
        String sub2 = "BA";
        System.out.println(checkSubSeq(str, sub));  //expected outcome: true
        System.out.println(checkSubSeq(str, sub2));  //expected outcome: false
    }

    private static boolean checkSubSeq(String str, String sub) {
        int i=0, j=0;
        str = str.toLowerCase();
        sub  = sub.toLowerCase();
        while(i<str.length() && j<sub.length()){
            if(str.charAt(i) == sub.charAt(j)){
                j++;
            }
            i++;
        }

       return j==sub.length();
    }
}
