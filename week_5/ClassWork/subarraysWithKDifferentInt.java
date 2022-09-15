package week_5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class subarraysWithKDifferentInt {
    public int subarraysWithKDistinct(int[] nums, int k) {

        int start = 0;
        int end = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        while (end < n) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            if (map.size() == 2) {
                count += end - start + 1;
            }
            while (start < end && map.size() > 2) {
                map.put(nums[start], map.get(nums[start]) - 1);
                start++;
            }
            count += end - start + 1;
            end++;
        }

        return count;
    }
}
