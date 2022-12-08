
/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
public class ReverseWordsInString {

    public static void main(String[] args) {
        String str = " a good   example "; //expected outcome: "example good a"

        //trimming and replacing multiple spaces with a single space
        str = reverseStr(str.trim().replaceAll(" +", " "));

        System.out.println(str);
    }

    //idea: we first reverse the individual words,
    //      than reverse the whole string to get our expected result.
    private static String reverseStr(String str){
        char[] arr = str.toCharArray();
        int low=0, high=-1;

        for(int i=1; i<arr.length-1; i++){
            if(arr[i]==' '){
                high = i-1;
                reverseArr(arr, low, high);
                low = i+1;
            }
        }

        if(low<str.length()){
            reverseArr(arr, low, str.length()-1);
        }
        reverseArr(arr, 0, arr.length-1);
        return String.valueOf(arr);
    }

    private static void reverseArr(char[] arr, int low, int high){
        while(low<high){
            swapElements(arr, low, high);
            low++;
            high--;
        }
    }

    private static void swapElements(char[] arr, int low, int high) {
        char temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
