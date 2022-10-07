package week_7_Stacks;

import java.util.Stack;

public class valid_prentheses {

    public boolean isValid(String s) {

        int len = s.length();
        if (len == 1)
            return false;

        Stack<Character> tracker = new Stack<>();

        for (int index = 0; index < len; index++) {

            if (s.charAt(index) == '(' || s.charAt(index) == '{' || s.charAt(index) == '[') {
                tracker.push(s.charAt(index));
            } else {
                if (tracker.isEmpty())
                    return false;
                if (s.charAt(index) == '}') {
                    if (tracker.peek() == '{')
                        tracker.pop();
                    else
                        return false;
                } else if (s.charAt(index) == ')') {
                    if (tracker.peek() == '(')
                        tracker.pop();
                    else
                        return false;
                } else {
                    if (tracker.peek() == '[')
                        tracker.pop();
                    else
                        return false;
                }
            }
        }
        return tracker.isEmpty();
    }

}
