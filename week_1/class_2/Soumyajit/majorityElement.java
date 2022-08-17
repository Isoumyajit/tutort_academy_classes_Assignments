package class_2.Soumyajit;

public class majorityElement {
    public int majorityElement_(int[] nums) {

        int num1 = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (num1 == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    num1 = nums[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num1 == nums[i])
                count++;
        }
        return num1;
    }
}
