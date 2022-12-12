import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 */
public class AnagramSearch {
    public static void main(String[] args) {
        String txt = "abab";
        String pat = "ab";
        System.out.println(angramSearch(txt, pat));
    }

    private static List<Integer> angramSearch(String txt, String pat) {
        int N = txt.length();
        int M = pat.length();
        int CHAR = 256;
        List<Integer> list = new ArrayList<>();
        if(N<M){
            return list;
        }

        int[] count = new int[CHAR];

        for(int i=0; i<M; i++){
            count[txt.charAt(i)]++;
            count[pat.charAt(i)]--;
        }
        int i=0;
        for(i=0; i<N-M; i++){
            System.out.println(i);
            if(areAnagram(count)){
                list.add(i);
            }
            count[txt.charAt(i)]--;
            count[txt.charAt(i+M)]++;

        }

        if(areAnagram(count)){
            list.add(i);
        }

        return list;
    }

    private static boolean areAnagram(int[] count){
        for(int i=0; i<256; i++){
            if(count[i]!=0)
                return false;
        }

        return true;
    }
}
