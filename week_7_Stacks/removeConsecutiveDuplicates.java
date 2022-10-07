package week_7_Stacks;

import java.util.Stack;

public class removeConsecutiveDuplicates {
    public String removeDuplicates(String s, int k) {

        Stack<pair> st = new Stack<>();
        StringBuilder answer = new StringBuilder();
        for (char a : s.toCharArray()) {
            if (st.isEmpty() || st.peek().data != a) {
                st.push(new pair(a, 1));
            } else {
                pair p = st.peek();
                st.pop();
                p.count++;
                if (p.count < k)
                    st.push(p);
            }
        }
        while (!st.isEmpty()) {
            int c = st.peek().count;
            while (c > 0) {
                answer.append(st.peek().data);
                c--;
            }
            st.pop();
        }
        return answer.reverse().toString();
    }
}

class pair {
    char data;
    int count;

    pair(char data, int count) {
        this.data = data;
        this.count = count;
    }
}
// Asteroid collision
// Min stack , maxstack
