package week_6.Assignments;

public class shuffleArray {
    public int[] shuffle(int[] nums, int n) {

        int start = 0;
        int second = n;
        int index = 0;
        int[] ans = new int[nums.length];
        while (start < n) {
            ans[index++] = nums[start++];
            ans[index++] = nums[second++];
        }
        return ans;

    }
}
