import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 * This code uses the linked list - find the starting node of the cyclic linkedList logic.
 */
public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr = {0, 2 , 1, 3, 2, 2}; //expected outcome: 2
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int slow=nums[0], fast=nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
