package week_6.Assignments;

public class sortArraybyParity {
    public int[] sortArrayByParityII(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        while (i < nums.length && j >= 0) {
            if (nums[i] % 2 == 0)
                i += 2;
            if (nums[j] % 2 == 1)
                j -= 2;
            else {
                swap(nums, i, j);
            }
        }
        return nums;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
