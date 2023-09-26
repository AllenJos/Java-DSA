package Arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @see <a href="https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab">
 *     Leaders in an Array - GFG
 *     </a>
 */

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(Solution.leaders(arr, arr.length));
    }
}

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(arr[arr.length-1]);
        int currentLeader = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i]>=currentLeader) {
                leaders.add(arr[i]);
                currentLeader = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
