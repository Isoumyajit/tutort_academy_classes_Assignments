package week_6.Assignments;

public class firstStringOccurance {
    public int strStr(String haystack, String needle) {
        int[] lps = new int[needle.length()];
        preProcess(lps, needle);
        int ans = -1;
        for (int i = 0, j = 0; i < haystack.length() && j < needle.length();) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else if (j == 0)
                i++;
            else
                j = lps[j - 1];

            if (j == needle.length()) {
                ans = i - needle.length();
                break;
            }
        }

        return ans;
    }

    private static void preProcess(int[] arr, String str) {
        int first = 0;
        int second = 0;
        for (first = 1; first < arr.length;) {
            if (str.charAt(first) == str.charAt(second)) {
                arr[first] = second + 1;
                second++;
                first++;
            } else if (second == 0) {
                arr[first] = second;
                first++;
            } else
                second = arr[second - 1];
        }
    }
}