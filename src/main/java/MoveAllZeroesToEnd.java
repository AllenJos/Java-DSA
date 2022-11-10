
//Code to move all the zeroes in an array to the end of the same array.
public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 10, 0, 20}; //expected outcome: 8 5 10 20 0 0
        moveAllZeroes(arr);

        for(int e: arr)
            System.out.print(e+" ");
    }

    private static void moveAllZeroes(int[] arr) {
        if(arr.length==0)
            return;
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }

        if(index<arr.length){
            for(int i=index; i<arr.length; i++){
                arr[i]=0;
            }
        }

    }
}
