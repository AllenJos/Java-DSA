
//code for the famous Trapping Rain Water problem.
//Given heights of N bars. Find the total amount of water each bar can hold.
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2, 5}; //expected outcome: 6
//        int[] arr = {5, 0, 6, 2, 3}; //expected outcome: 6
//        int[] arr = {2,0,2}; //expected outcome: 2
        int res = trapRainWater(arr);
        System.out.println(res);
    }

    private static int trapRainWater(int[] arr) {
        //the idea is that for a particular bar the amount of water it can hold is:
        //Minimum of(Max height of a bar on it's left side, Max height of a bar on it's right side) - Height of the current bar.
        //i.e., Min(lmax,rmax) - arr[i]
        //and also observe that the two end bars can never hold any amount of water.
        if(arr.length==0)
            return 0;

        int res=0;

        //so we will create two arrays for storing lmax and rmax of each bars.
        int[] lmax=new int[arr.length];
        lmax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }

        int[] rmax=new int[arr.length];
        rmax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        //traversing only from i=1 to arr.length-2, because as said earlier, end bars can't hold water.
        for(int i=1; i<arr.length-1; i++){
            res+= Math.min(rmax[i], lmax[i]) - arr[i];
        }

//        for(int e: lmax)
//            System.out.print(e+" ");
//        System.out.println();
//        for(int e: rmax)
//            System.out.print(e+" ");

        return res;
    }
}
