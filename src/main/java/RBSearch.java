public class RBSearch {
    //q is the Modulo we are using in this code
    public static final int q = 101;

    //d is the weighted sum we are using
    public static final int d = 256;

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issi";
        strStr(haystack, needle);
    }

    public static void strStr(String haystack, String needle) {
        int N = haystack.length();
        int M = needle.length();

        //calculating d^M-1
        int h=1;
        for(int i=1; i<=M-1; i++){
            h = (h*d)%q;
        }

        //calculating hash values for first window in haystack
        //and for needle using Horner's rule
        int p=0, t=0;
        for(int i=0; i<M; i++){
            p = (p*d + needle.charAt(i))%q;
            t = (t*d + haystack.charAt(i))%q;
        }

        //iterating over the haystack using sliding window
        for(int i=0; i<=N-M; i++){
            //if hash value for current window is equal to,
            //the hash value of pattern
            if(p==t){
                boolean flag = true;
                for(int j=0; j<M; j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    System.out.println(i+" ");
            }

            //we don't want to calculate next hash value for the last window
            if(i<N-M){
                //calculating hash for next window
                t = (d*(t- haystack.charAt(i)*h) + haystack.charAt(i+M)) % q;
                if(t<0)
                    t+=q;
            }
        }
    }
}
