package week_2.class2.Soumyajit;

public class findDifference {

  public char findTheDifference(String s, String t) {
    int[] hash = new int[26];
    for (char a : s.toCharArray()) {
      hash[a - 'a']++;
    }
    for (char a : t.toCharArray()) {
      if (hash[a - 'a'] == 0) return a;
      hash[a - 'a']--;
    }
    return 'a';
  }
}
