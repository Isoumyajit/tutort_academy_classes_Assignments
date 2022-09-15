import java.util.Stack;

public class nextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int len1 = nums.length;
        int[] right = new int[len1];
        nextGreaterRight(right, nums);
        return right;
    }

    private static void nextGreaterRight(int[] right, int arr[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            int index = i % arr.length;
            if (i == 2 * arr.length - 1) {
                st.push(arr[index]);
                right[index] = -1;
            } else {
                while (!st.isEmpty() && st.peek() <= arr[index]) {
                    st.pop();
                }
                if (st.isEmpty())
                    right[index] = -1;
                else
                    right[index] = st.peek();
                st.push(arr[index]);
            }
        }
    }
}
