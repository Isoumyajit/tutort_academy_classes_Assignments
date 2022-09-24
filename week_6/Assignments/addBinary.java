package week_6.Assignments;

public class addBinary {
    public String addBinary_(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int len1 = a.length();
        int len2 = b.length();
        int i = len1 - 1;
        int j = len2 - 1;
        int carry = 0;
        int sum = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            ans.append(sum % 2);
            carry = sum / 2;
        }
        return ans.reverse().toString();
    }

}
