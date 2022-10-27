import java.util.Iterator;
import java.util.LinkedList;

//The famous Josephus problem-
//Explanation: n persons are standing in circle and we are provided with a value k, where
//we kill kth person in each time till there is only one person remaining
public class Josephus {

    public static void main(String[] args) throws InterruptedException {
        int lastItem = josephus(8,2); //expected output: 0
        System.out.println(lastItem);
    }

    public static int josephus(int n, int k)
    {
        LinkedList<Integer> list = new LinkedList<>();

        //adding 0 to n-1 in the list
        for(int i=0; i<n; i++)
            list.add(i);

        Iterator it = list.iterator();

        //iterate over the list
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
                if(count<k) //reached the end of the list but count is still lesser than k
                {
                    it = list.iterator(); //resetting the iterator to the front of the linked list when it
                                          //reaches the end
                    it.next();
                    count++;
                }
            }
            //kill the kth person
            it.remove();
        }

        //return the last element remaining
        return (list.getFirst());
    }

}
