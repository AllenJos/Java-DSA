import java.util.Iterator;
import java.util.LinkedList;

public class Josephus {

    public static void main(String[] args) throws InterruptedException {
        int lastItem = josephus(8,2);
        System.out.println(lastItem);
    }

    public static int josephus(int n, int k)
    {
        LinkedList<Integer> list = new LinkedList<>();

        //adding 0 to n-1 in the list
        for(int i=0; i<n; i++)
            list.add(i);

        Iterator it = list.iterator();

        while(list.size()>1)
        {
            int count=0;

            //loop till count=k
            while(count<k)
            {
                //loop till reaches the end of list or count=k
                while(it.hasNext() && count<k)
                {
                    it.next();
                    count++;
                }
                if(count<k) //reached the end
                {
                    it = list.iterator(); //resetting the iterator to the front of the linked list when it
                    //reaches the end
                    it.next();
                    count++;
                }
            }
            //remove
            it.remove();
        }


        return (list.getFirst());
    }

}
