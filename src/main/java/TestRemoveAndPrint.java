import java.util.ArrayList;
import java.util.Iterator;

//Basic custom DS to add an item and remove all occurrences of a given item and print
public class TestRemoveAndPrint {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        addX(10);
        addX(20);
        addX(10);
        addX(30);
        removeAndPrint(10);
        addX(30);
        addX(40);
        addX(60);
        removeAndPrint(30);
    }

    public static void addX(int x){
        list.add(x);

    }

    public static void removeAndPrint(int x){
        Iterator it = list.iterator();
        while(it.hasNext()){
            int current = (Integer)it.next();
            if(current == x)
                it.remove();
            else
                System.out.print(current+" ");
        }
        System.out.println();

    }
}
