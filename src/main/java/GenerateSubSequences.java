
//Code to print all the Sub Sequences of a String using Recursion.
//Note: A Subsequence is obtained by removing 0 or more characters from a string and
//       keeping the order of remaining characters same.
public class GenerateSubSequences {
    public static void main(String[] args) {
        //MySolution:
        generateSub("ABC", ""); //expected outcome:  A AB ABC AC B BC C

        System.out.println();

        //GFG's Solution
        generateSubSequence("ABC", "", 0); //expected outcome:   C B BC A AC AB ABC

    }

    //Solution from GFG:
    private static void generateSubSequence(String abc, String s, int n) {
        if(n==abc.length()) {
            System.out.print(s+" ");
            return;
        }
        char currChar = abc.charAt(n);
        generateSubSequence(abc, s, n+1);
        generateSubSequence(abc, s+abc.charAt(n), n+1);

    }


    //My Solution:
    private static void generateSub(String abc, String str) {
        System.out.print(str+" ");
        if(str.length()==abc.length())
            return;

        int n=0;
        while(n<abc.length()){
            char curr = abc.charAt(n);
            //I am basically checking if the current character we wish to concatenate to str,
            // appears after the last character of str in abc or not.
            if(str.length()==0 || abc.indexOf(curr)>abc.indexOf(str.charAt(str.length()-1)))
                generateSub(abc, str+abc.charAt(n));
            n++;
        }
    }


}
