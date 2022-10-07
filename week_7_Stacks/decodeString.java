package week_7_Stacks;

public class decodeString {
    private static int i = 0;

    public String decodeString_(String s) {

        i = 0;
        return decode(s);
    }

    private static String decode(String s) {

        String x = "";
        StringBuilder ans = new StringBuilder();
        int count = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (c == '[') {
                x = decode(s);
                for (int j = 1; j <= count; j++) {
                    ans.append(x);
                }
                count = 0;

            } else if (c >= '0' && c <= '9') {
                count = count * 10 + c - '0';
            } else if (c >= 'a' && c <= 'z')
                ans.append(c);
            else
                break;
        }
        return ans.toString();
    }
}
