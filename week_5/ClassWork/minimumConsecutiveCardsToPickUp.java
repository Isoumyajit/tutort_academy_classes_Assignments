package week_5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class minimumConsecutiveCardsToPickUp {
    public int minimumCardPickup(int[] cards) {

        int start = 0;
        int end = 0;
        int countMax = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (start < end) {
            if (map.containsKey(cards[end] - 1) || map.containsKey(cards[end] + 1)) {
                map.put(cards[end], map.getOrDefault(cards[end], 0) + 1);
                if (map.get(cards[end]) == 2) {
                    countMax = Math.min(countMax, end - start + 1);
                }
                int val = cards[end];
                while (start < end && map.get(cards[val]) > 2) {
                    map.put(cards[start], map.get(cards[start]) - 1);
                    start++;
                }
            } else {
                map.clear();
                map.put(cards[end], map.getOrDefault(cards[end], 0) + 1);
            }
            end++;
        }

        return countMax;
    }
}
