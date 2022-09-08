import java.util.ArrayList;
import java.util.List;

public class summaryRanges {
    public List<String> summaryRanges_(int[] nums) {
        List<String> answer = new ArrayList<>();
        int i = 1;
        int n = nums.length;
        if (n == 0)
            return answer;
        if (n == 1) {
            answer.add(String.valueOf(nums[0]));
            return answer;
        }
        boolean flag = false;
        StringBuffer str = new StringBuffer();
        str.append(nums[0]);
        for (i = 1; i < n; i++) {
            long a = (long) nums[i];
            long b = (long) nums[i - 1];
            long dif = 1;
            if (a - b == dif) {
                flag = true;
                continue;
            } else {
                if (flag) {
                    str.append("->" + nums[i - 1]);
                    answer.add(str.toString());
                } else {
                    answer.add(str.toString());
                }
                str.delete(0, str.length());
                str.append(nums[i]);
                flag = false;
            }
        }
        if (!flag) {
            answer.add(str.toString());
        } else {
            answer.add(str + "->" + nums[n - 1]);
        }
        return answer;
    }
}
