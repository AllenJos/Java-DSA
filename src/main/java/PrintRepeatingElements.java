import java.util.HashSet;

//simple code to print Repeating Elements in an array.
public class PrintRepeatingElements {

    public static void main(String[] args) {
        int[] arr = {10, 8, 7, 7, 10, 10}; //expected outcome: 7 10 10
        printRepeating(arr);
    }

    public static void printRepeating(int[] arr){
        HashSet<Integer> repeating = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            if(repeating.contains(arr[i]))
                System.out.print(arr[i]+" ");
            else
                repeating.add(arr[i]);
        }
    }
}
