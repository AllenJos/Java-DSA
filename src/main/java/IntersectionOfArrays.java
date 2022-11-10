import java.util.*;

//simple code to Print the intersection of Two Arrays
//with maintaining the order according to the first array
public class IntersectionOfArrays {

    public static void main(String[] args) {
        Integer a[] = {10, 15, 20, 25, 30, 80}; //expected outcome: 15 30 80
        Integer b[] = {80, 30, 5, 15};
        printIntersetionOfTwoArrays(a, b);
    }

    public static void printIntersetionOfTwoArrays(Integer a[], Integer b[]){
        //add the second array into a HashSet
        Set<Integer> set2 = new HashSet<>(Arrays.asList(b));

        //then traverse through the first array to check if the elements are present in the HashSet
        //this ensures we maintain the order w.r.t. first array
        for(int i=0; i<a.length; i++){
            if(set2.contains(a[i])){
                System.out.print(a[i]+" ");
            }
        }
    }
}
