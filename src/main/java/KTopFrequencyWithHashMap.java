import java.util.*;

//code to find K top frequencies in an array
//if frequencies are same for some elements
//then print in ascending order
public class KTopFrequencyWithHashMap {
    public static void main(String[] args) {
//        int[] arr = {10, 5, 20, 5, 10, 19, 30};
        int[] arr = {20, 40, 30, 20, 30, 40, 60, 60};
        int k = 3;
        kTopFreq(arr, k);
    }

    public static void kTopFreq(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();

        //adding each elements to a hashMap with key:element and value: frequency
        //Note the frequency is assigned with getOrDefault, where default is zero if no
        //previous frequency is found for that element
        for(int i=0; i<arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

        //the map elements are stored to a list because we cannot sort HashMaps
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        //we create our own Comparator because we need to sort according to the key's
        //and if some key's have same frequencies we need to sort according to key in
        //ascending order
        Collections.sort(list, new MyComparator());

        for(int i=0; i<k; i++){
            System.out.print(list.get(i).getKey()+" ");
        }
    }


}
class MyComparator implements Comparator<Map.Entry<Integer, Integer>>{

    @Override
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        //if any key has same frequency we sort according to the keys
        if(m1.getKey()==m1.getKey())
            return m1.getKey()-m2.getKey();

        //else we only sort according to the values
        return m1.getValue()-m2.getValue();
    }
}


