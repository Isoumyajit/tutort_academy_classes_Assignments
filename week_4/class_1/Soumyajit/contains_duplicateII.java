import java.util.HashMap;
import java.util.Map;

public class contains_duplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        int slow = 0;
        int fast = 0;
        while (fast < n) {

            if (slow + k < fast) {
                map.remove(nums[slow]);
                slow += 1;
            }
            if (map.containsKey(nums[fast]))
                return true;
            else
                map.put(nums[fast], fast);
            fast++;
        }
        return false;
    }
}
