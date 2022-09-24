package week_6.Assignments;

public class decodeXoredArray {
    public int[] decode(int[] encoded, int first) {

        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] ^ encoded[i - 1];
        }
        return ans;
    }
}
