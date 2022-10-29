import java.util.HashSet;

//simple code to print distinct elements in an array with maintaining the order of appearance.
public class PrintDistinctElements {

    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 4, 7, 5}; //expected outcome: 4 8 5 7
        printDistinct(arr);
    }

    public static void printDistinct(int[] arr){
        HashSet<Integer> distinct = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            //checking if HashSet contains the current array element already
            if(!distinct.contains(arr[i])){
                //if array element is not found in our HashSet:
                //Printing the array element first and then adding it to the HashSet
                //ensures that we print in the same order of appearance.
                System.out.print(arr[i]+" ");
                distinct.add(arr[i]);
            }
        }
    }
}
