//Important Interview Question: Implements Prefix Sum Technique
//Given an array find if there exist an Equilibrium Point.
//Equilibrium point is defined as a point in an array where sum of the elements on its left side is-
//-equal to sum of the elements on its right side.
public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 20, 6}; //expected outcome: True: Equilibrium Point at index 4
//        int[] arr = {4, 2, -2}; //expected outcome: True: Equilibrium Point at index 0
//        int[] arr = {3, 9, 5, -8, 7}; //expected outcome: False: No Equilibrium point found
        equilPoint(arr);
    }

    //This method uses prefix sum technique to solve the problem.
    //Here we are also considering suffix sum to find the equilibrium point.
    private static void equilPoint(int[] arr) {
        int[] prefixSum = new int[arr.length];
        int[] suffixSum = new int[arr.length];

        prefixSum[0] = 0;
        for(int i=1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1]+arr[i-1];
        }

        suffixSum[arr.length-1] = 0;
        for(int i=arr.length-2; i>=0; i--){
            suffixSum[i] = suffixSum[i+1]+arr[i+1];
        }

        for(int i=0; i<arr.length; i++){
            if(prefixSum[i]==suffixSum[i]) {
                System.out.println("True: Equilibrium Point at index " + i);
                return;
            }
        }

//        for(int e: prefixSum)
//            System.out.print(e+" ");
//        System.out.println();
//        for(int e: suffixSum)
//            System.out.print(e+" ");
        System.out.println("False: No Equilibrium point found");
    }
}
