/**
 * Given two strings s1 and s2, return true if s2 is an anagram of s1, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class CheckForAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(checkForAnagram(s1, s2)); //expected outcome: true
    }

    private static boolean checkForAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] count = new char[26];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)-'a']++;
        }

        for(int i=0; i<s2.length(); i++){
            count[s2.charAt(i)-'a']--;
        }

        boolean res=true;
        for(int i=0; i<count.length; i++){
            if(count[i]!=0){
                res=false;
                break;
            }
        }

        return res;
    }
}
