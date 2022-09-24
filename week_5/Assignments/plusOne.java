package week_5.Assignments;

import java.util.ArrayList;

public class plusOne {
    public int[] plusOne_(int[] digits) {

        int n = digits.length;
        int i = n - 1;
        int carry = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while (i >= 0 || carry > 0) {

            int sum = 0;
            if (i == n - 1) {
                sum = digits[i] + 1;
                if (sum >= 10)
                    carry = sum / 10;
                else
                    carry = 0;
                answer.add(sum % 10);

            } else if (i >= 0) {
                sum = carry + digits[i];
                if (sum >= 10)
                    carry = sum / 10;
                else
                    carry = 0;
                answer.add(sum % 10);
            } else {
                answer.add(carry);
                carry = 0;
            }
            i--;
        }
        int[] ans = new int[answer.size()];
        int index = 0;
        for (i = answer.size() - 1; i >= 0; i--) {
            ans[index++] = answer.get(i);
        }
        return ans;
    }
}
