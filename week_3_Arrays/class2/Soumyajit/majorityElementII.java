import java.util.ArrayList;
import java.util.List;

public class majorityElementII {
    public List<Integer> majorityElement(int[] nums) {

        int len = nums.length;
        List<Integer> answer = new ArrayList<>();
        if (len == 1) {
            answer.add(nums[0]);
            return answer;
        }

        int count1 = 1;
        int num1 = nums[0];
        int count2 = 0;
        int num2 = nums[1];

        for (int index = 1; index < len; index++) {

            if (nums[index] == num1) {
                count1++;
            } else if (nums[index] == num2) {
                count2++;
            } else {
                if (count1 == 0) {
                    num1 = nums[index];
                    count1 = 1;
                } else if (count2 == 0) {
                    num2 = nums[index];
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }
        }
        if (count1 > 0) {
            count1 = 0;
            for (int index = 0; index < len; index++) {
                if (nums[index] == num1)
                    count1++;
            }
        }
        if (count1 > len / 3)
            answer.add(num1);
        if (count2 > 0) {
            count2 = 0;
            for (int index = 0; index < len; index++) {
                if (nums[index] == num2)
                    count2++;
            }
        }
        if (count2 > len / 3)
            answer.add(num2);
        return answer;
    }
}