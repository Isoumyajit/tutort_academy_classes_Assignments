package week_8;

import java.util.HashMap;
import java.util.Map;

public class distributesCandies {
    public int distributeCandies(int[] candyType) {

        Map<Integer, Integer> st = new HashMap<>();
        for (int a : candyType)
            st.putIfAbsent(a, 0);

        int size = st.size();
        int len = candyType.length;
        if (size > len / 2)
            return len / 2;
        return size;
    }
}
