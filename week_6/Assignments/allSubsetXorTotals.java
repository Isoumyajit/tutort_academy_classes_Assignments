package week_6.Assignments;

public class allSubsetXorTotals {
    private static int sum = 0;

    public int subsetXORSum(int[] nums) {
        sum = 0;
        getSum(nums, 0, new int[1]);
        return sum;
    }

    /**
     * If the current index is the last index, then add the current value of
     * helper[0] to the sum.
     * Otherwise, XOR the current value of helper[0] with the current index's value,
     * and recurse. Then,
     * XOR the current value of helper[0] with the current index's value again, and
     * recurse
     * 
     * @param arr    the array of integers
     * @param index  the current index of the array
     * @param helper an array of size 1, which is used to store the current sum.
     */
    private static void getSum(int[] arr, int index, int[] helper) {
        if (index == arr.length) {
            sum += helper[0];
            return;
        }

        helper[0] ^= arr[index];
        getSum(arr, index + 1, helper);
        helper[0] ^= arr[index];
        getSum(arr, index + 1, helper);
    }
}
