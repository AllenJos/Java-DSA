import java.util.Arrays;
import java.util.Comparator;

//Simple code showing how to implement a custom Comparator which,
//sorts the array in a way that all even elements appear first.
//This uses the new Java 8 implementing comparators using Anonymous class.
public class EvenOddComparator {

    public static void main(String[] args) {
        Integer[] arr = {5, 10, 3, 30, 20};
        System.out.println("Before: "+ Arrays.toString(arr));  //Before: [5, 10, 3, 30, 20]
        Comparator<Integer> evenOddComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer e1, Integer o1) {
                return e1%2 - o1%2;
            }
        };
        Arrays.sort(arr, evenOddComparator);
        System.out.println("After: "+Arrays.toString(arr));  //After: [10, 30, 20, 5, 3]
    }
}
