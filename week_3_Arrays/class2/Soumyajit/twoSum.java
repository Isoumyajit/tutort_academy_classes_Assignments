import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoSum_(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> helper = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            helper.putIfAbsent(nums[i], i);
            if (helper.containsKey(target - nums[i]) &&
                    helper.get(target - nums[i]) != i) {
                ans[0] = helper.get(target - nums[i]);
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
