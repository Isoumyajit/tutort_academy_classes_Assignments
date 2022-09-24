package week_6.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            ans.add(candies[i] + extraCandies >= max);
        }
        return ans;
    }
}
