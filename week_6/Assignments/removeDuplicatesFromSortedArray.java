package week_6.Assignments;

public class removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 0;
        int val = 0;
        int count = 0;
        int len = nums.length;
        val = nums[0];
        count = 1;
        start = 1;
        end = 1;
        while (end < len) {
            if (val == nums[end]) {
                count++;
            } else {
                count = 1;
                val = nums[end];
            }
            if (count > 2) {
                end++;
            } else if (start != end) {
                swap(nums, start, end);
                start++;
                end++;
            } else {
                start++;
                end++;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

    }
}
