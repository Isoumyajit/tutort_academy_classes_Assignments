import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElementsI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int len2 = nums2.length;
        int len1 = nums1.length;
        int[] ans = new int[len1];

        for (int i = len2 - 1; i >= 0; i--) {
            if (i == len2 - 1) {
                st.push(nums2[i]);
                map.put(nums2[i], -1);
            } else {
                while (!st.isEmpty() && st.peek() < nums2[i]) {
                    st.pop();
                }
                if (st.isEmpty())
                    map.put(nums2[i], -1);
                else
                    map.put(nums2[i], st.peek());
                st.push(nums2[i]);
            }

        }

        for (int i = 0; i < len1; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;

    }
}
