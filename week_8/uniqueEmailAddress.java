package week_8;

import java.util.HashSet;
import java.util.Set;

public class uniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {

        Set<String> st = new HashSet<>();
        for (String a : emails) {
            StringBuilder dummy = new StringBuilder();
            for (int i = 0; i < a.length(); i++) {
                char x = a.charAt(i);
                switch (x) {
                    case '.':
                        break;
                    case '+':
                        while (x != '@') {
                            x = a.charAt(++i);
                        }
                        dummy.append(a.substring(i));
                        i = a.length();
                        break;
                    case '@':
                        dummy.append(a.substring(i));
                        i = a.length();
                        break;
                    default:
                        dummy.append(x);
                }
            }
            st.add(dummy.toString());
        }
        System.out.println(st);
        return st.size();
    }
}
