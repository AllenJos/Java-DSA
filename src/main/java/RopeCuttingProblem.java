/**
 * Code for the Rope Cutting problem:
 * Given a rope of size N and three different lengths namely 'a', 'b' and 'c'.
 * Find the max number of pieces it can be cut into.
 * Every piece should be of length a, b or c.
 * --- Recursive Solution //there is a better DP solution, check that also ---
 */
public class RopeCuttingProblem {
    public static void main(String[] args) {
//        int N=5, a=2, b=5, c=1; //expected outcome: 5
        int N=23, a=11, b=9, c=12;  //expected outcome: 2
        System.out.println(ropeCut(N, a, b, c));
    }

    //idea: three possibilities for every cut
    //               N=23
    //             /  \   \
    //          23-9 23-12 23-11
    //           /     \    \
    //         ---           12-12
    //         /              \
    //        -ve              0
    //
    //
    private static int ropeCut(int N, int a, int b, int c) {
        if(N==0)
            return 0;
        if(N<0)
            return -1;

        int res = Math.max(ropeCut(N-a, a, b, c),
                Math.max(ropeCut(N-b, a, b, c), ropeCut(N-c, a , b, c)));

        if(res==-1)
            return -1;

        return res+1;
    }


}
