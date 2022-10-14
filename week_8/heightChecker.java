package week_8;

public class heightChecker {
    public int heightChecker_(int[] heights) {
        int[] heightsEX = new int[101];
        for (int val : heights)
            heightsEX[val]++;
        int count = 0;
        int index = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightsEX[index] == 0) {
                index++;
            }
            if (heights[i] != index) {
                count++;
            }
            heightsEX[index]--;
        }
        return count;
    }
}
