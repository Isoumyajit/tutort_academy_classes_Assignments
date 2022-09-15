public class nextGreaterElementIII {
    public int nextGreaterElement(int n) {
        long max = Integer.MAX_VALUE;
        long num = n;
        String num1 = String.valueOf(num);
        if (max <= num)
            return -1;

        StringBuffer h = new StringBuffer(num1);
        int lastIndex = -1;
        for (int i = 1; i < h.length(); i++) {
            if (h.charAt(i) - '0' > h.charAt(i - 1) - '0') {
                lastIndex = i;
            }
        }
        // System.out.println(h);
        if (lastIndex == -1)
            return -1;
        int prevNum = h.charAt(lastIndex - 1) - '0';
        int prev = lastIndex - 1;
        for (int i = lastIndex + 1; i < h.length(); i++) {
            if (prevNum < h.charAt(i) - '0')
                lastIndex = i;
        }

        char a = h.charAt(lastIndex);
        char b = h.charAt(prev);
        h.setCharAt(prev, a);
        h.setCharAt(lastIndex, b);
        System.out.println(h);
        reverse(h, prev + 1, h.length() - 1);
        if (Long.parseLong(h.toString()) > max)
            return -1;
        return Integer.parseInt(h.toString());
    }

    private static void reverse(StringBuffer s, int a, int b) {
        for (int i = a, j = b; i < j; i++, j--) {
            char x = s.charAt(i);
            char y = s.charAt(j);
            s.setCharAt(j, x);
            s.setCharAt(i, y);
        }
    }
}
