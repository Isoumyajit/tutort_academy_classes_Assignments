package week_5.Assignments;

import java.util.Arrays;

public class singleNumberIII {
    public int[] singleNumber(int[] nums) {

        Arrays.sort(nums);
        int start = 0;
        int i = 0;
        int[] ans = new int[2];
        while (start < nums.length) {
            if (start < nums.length - 1 && nums[start] != nums[start + 1]) {
                ans[i++] = nums[start];
                start++;
            } else if (start == nums.length - 1) {
                ans[i++] = nums[start];
                break;
            } else
                start += 2;

        }
        return ans;
    }
}
