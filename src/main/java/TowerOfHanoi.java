
//Code for the famous Tower of Hanoi problem. Recursive Solution
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=2;
        char a='A', b='B', c='C';
        towerOfHanoi(n, a, b, c);
        /**
         * //expected outcome:
         *
         * Move Disc 1 from A to B                //move discs n-1 from A to B using C as Auxiliary Tower
         * Move Disc 2 from A to C                //move disc n from A to C
         * Move Disc 1 from B to C                //move discs n-1 from B to C using A as Auxiliary Tower
         *
         */
    }

    private static void towerOfHanoi(int n, char a, char b, char c) {
        if(n<=0)
            return;
        if(n==1) {
            System.out.println("Move Disc 1 from " + a + " to " + c);
            return;
        }

        towerOfHanoi(n-1, a, c, b);
        System.out.println("Move Disc "+n+" from "+a+" to "+c);
        towerOfHanoi(n-1, b, a, c);
    }
}
