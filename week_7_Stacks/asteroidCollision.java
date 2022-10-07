package week_7_Stacks;

import java.util.Stack;

public class asteroidCollision {
    /**
     * If the current asteroid is negative, then we pop all the positive asteroids
     * from the stack until
     * we find a negative asteroid or the stack is empty. If we find a negative
     * asteroid, then we push
     * the current asteroid onto the stack. If the stack is empty, then we push the
     * current asteroid
     * onto the stack. If the current asteroid is positive, then we push it onto the
     * stack
     * 
     * @param asteroids an array of integers representing the size of the asteroids
     * @return The return value is an array of integers.
     */
    public int[] asteroidCollision_(int[] asteroids) {

        Stack<Integer> st = new Stack<>();
        for (int val : asteroids) {
            if (st.isEmpty())
                st.push(val);
            else {
                if (val < 0) {
                    boolean flag = false;
                    while (!st.isEmpty()) {

                        int topData = st.peek();
                        if (topData < 0) {
                            st.push(val);
                            break;
                        }
                        if (topData == Math.abs(val)) {
                            flag = true;
                            st.pop();
                            break;
                        } else if (Math.abs(topData) > Math.abs(val)) {
                            flag = true;
                            break;
                        } else
                            st.pop();
                    }
                    if (!flag && st.isEmpty()) {
                        st.push(val);
                    }

                } else
                    st.push(val);
            }
        }
        int[] answer = new int[st.size()];
        int index = answer.length - 1;
        while (!st.isEmpty())
            answer[index--] = st.pop();
        return answer;
    }
}
