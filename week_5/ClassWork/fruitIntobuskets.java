package week_5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class fruitIntobuskets {
    public int totalFruit(int[] fruits) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int start = 0;
        int end = 0;
        int n = fruits.length;
        while (end < n) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            if (map.size() > 2) {
                maxCount = Math.max(maxCount, (end - 1) - start + 1);
            }
            while (start < end && map.size() > 2) {
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if (map.get(fruits[start]) == 0)
                    map.remove(fruits[start]);
                start++;
            }
        }
        return maxCount;
    }
}
