public class majorityElement {

    public static int majority(int[] nums) {

        int num1 = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (num1 == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    num1 = nums[0];
                    count = 1;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) {
                count++;
            }
        }
        if (count > nums.length / 2)
            return num1;
        else
            return -1;
    }
}
