
//Code to find the union of two arrays.
//This code uses the idea of merge function of Merge Sort.
public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] left = {3, 5, 8, 8, 8, 10, 11, 13, 14};
        int[] right = {2, 8, 8, 9, 10, 16};
        unionOfTwoArrays(left, right);
    }

    private static void unionOfTwoArrays(int[] left, int[] right) {
        int i=0, j=0;
        while(i<left.length && j<right.length){
            if(i>0 && left[i]==left[i-1]){
                i++;
                continue;
            }
            if(j>0 && right[j]==right[j-1]){
                j++;
                continue;
            }
            if(left[i]<right[j])
                System.out.print(left[i++]+" ");
            else if(right[j]<left[i])
                System.out.print(right[j++]+" ");
            else{
                System.out.print(left[i++]+" ");
                j++;
            }
        }
        while(i<left.length){
            if(i>0 && left[i]!=left[i-1])
                System.out.print(left[i++]+" ");
        }
        while(j<right.length){
            if(j>0 && right[j]!=right[j-1])
                System.out.print(right[j++]+" ");
        }
    }
}
