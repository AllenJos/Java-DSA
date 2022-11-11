
//code to find out the Maximum Consecutive 1's in an Array.
public class MaxConsecutive1s {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 0, 1, 1, 1, 1, 0}; //expected outcome: 4
//        int[] arr = {0,0,0,0}; //expected outcome: 0
        int[] arr = {1,0, 1, 1, 0, 1, 1, 1, 1, 1}; //expected outcome: 5
        int res = maxCons1s(arr);
        System.out.println(res);
    }

    private static int maxCons1s(int[] arr) {
        int max1=0, count=0, i=0;
        //idea is to increment count if the element is 1 and keep track of max count.
        //if the element is 0, re-initialize count to 0.
        while(i<arr.length){
            if(arr[i]==1){
                count++;
                max1 = Math.max(max1, count);
            }else{
                count=0;
            }
            i++;
        }
        return max1;
    }
}
