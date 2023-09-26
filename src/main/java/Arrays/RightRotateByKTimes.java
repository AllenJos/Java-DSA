package Arrays;

import java.util.Arrays;

/**
 * @see  <a href="https://leetcode.com/problems/rotate-array/description/">
 *     Rotate Array Leetcode
 *       </a>
 */

public class RightRotateByKTimes {
    public static void main(String[] args) {
        SlowSolution slowSolution = new SlowSolution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        slowSolution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

        FasterSolution fasterSolution = new FasterSolution();
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7};
        fasterSolution.rotate(nums2, 3);
        System.out.println(Arrays.toString(nums2));
    }
}

class SlowSolution {
    public void rotate(int[] nums, int k) {
        for(int i=0; i<k; i++) {
            rightRotate(nums);
        }
    }

    public void rightRotate(int[] nums) {
        int temp = nums[nums.length-1];
        for(int i=nums.length-1; i>0; i--) {
            nums[i] = nums[i-1];
        }

        nums[0] = temp;
    }
}

class FasterSolution {
    public void rotate(int[] nums, int k) {
        int steps = k % nums.length;

       reverseArrayByPosition(nums, 0, nums.length-steps-1);
       reverseArrayByPosition(nums, nums.length-steps, nums.length-1);
       reverseArrayByPosition(nums, 0, nums.length-1);
    }

    private void reverseArrayByPosition(int[] nums, int low, int high) {
        while(low<high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
