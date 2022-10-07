package week_7_Stacks;

public class removeAlladjacentDuplicates {
    public String removeDuplicates(String s) {

        StringBuilder ans = new StringBuilder();

        for (char a : s.toCharArray()) {
            int size = ans.length();
            if (size > 0 && ans.charAt(size - 1) == a) {
                ans.deleteCharAt(size - 1);
            } else
                ans.append(a);
        }
        return ans.toString();
    }
}
