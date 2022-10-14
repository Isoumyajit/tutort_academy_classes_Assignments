package week_8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class rankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = arr.clone();
        Arrays.sort(ans);
        int index = 0;
        int lastRank = -1;
        for (int i = 0; i < ans.length; i++) {
            if (!map.containsKey(ans[i])) {
                lastRank = lastRank == -1 ? i + 1 : lastRank + 1;
            }
            map.putIfAbsent(ans[i], lastRank);
        }
        for (int ele : arr) {
            ans[index++] = map.get(ele);
        }
        return ans;
    }
}
