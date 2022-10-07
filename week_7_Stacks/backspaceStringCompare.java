package week_7_Stacks;

public class backspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();

        for (char a : s.toCharArray()) {
            int size = st1.length();
            if (size > 0 && a == '#')
                st1.deleteCharAt(size - 1);
            else if (a != '#')
                st1.append(a);
        }

        for (char a : t.toCharArray()) {
            int size = st2.length();
            if (size > 0 && a == '#')
                st2.deleteCharAt(size - 1);
            else if (a != '#')
                st2.append(a);
        }
        return st1.toString().equals(st2.toString());
    }
}
