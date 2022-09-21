package week_5.Assignments;

import java.util.Arrays;

public class singleNumberII {
    /**
     * If the number is the same as the next number, skip the next two numbers.
     * Otherwise, return the
     * number
     * 
     * @param nums an array of integers
     * @return The number that appears only once in the array.
     */
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        int start = 0;
        int len = nums.length;
        while (start < len) {
            if (start + 1 < len && nums[start] == nums[start + 1])
                start += 3;
            else
                return nums[start];
        }

        return -1;

    }

    /*
     * // Description
     * This is the optimized version of the above algorithm using Bit-manipulation
     * technique
     * TC -> O(N)
     * SC -> O(1)
     */

    public int singleNumber(int[] nums, boolean flag) {

        int one = 0;
        int two = 0;
        int com = 0;
        for (int val : nums) {
            one ^= val;
            com = ~two;
            one = com & one;

            two ^= val;
            com = ~one;
            two = com & two;
        }
        return one;
    }
}
