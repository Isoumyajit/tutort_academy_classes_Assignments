package week_2.class2.Soumyajit;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseVowels {

  public String reverseVowel(String s) {
    char[] answer = s.toCharArray();
    int i = 0;
    int j = s.length() - 1;
    ArrayList<Character> helper = new ArrayList<>();
    helper.addAll(
      Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    );
    while (i < j) {
      while (
        i < j &&
        !(
          answer[i] == 'a' ||
          answer[i] == 'e' ||
          answer[i] == 'i' ||
          answer[i] == 'o' ||
          answer[i] == 'u' ||
          answer[i] == 'A' ||
          answer[i] == 'E' ||
          answer[i] == 'I' ||
          answer[i] == 'O' ||
          answer[i] == 'U'
        )
      ) i++;
      while (
        i < j &&
        !(
          answer[j] == 'a' ||
          answer[j] == 'e' ||
          answer[j] == 'i' ||
          answer[j] == 'o' ||
          answer[j] == 'u' ||
          answer[j] == 'A' ||
          answer[j] == 'E' ||
          answer[j] == 'I' ||
          answer[j] == 'O' ||
          answer[j] == 'U'
        )
      ) j--;
      if (i > j) break;
      swap(answer, i, j);
      i++;
      j--;
    }

    return new String(answer);
  }

  private static void swap(char[] x, int a, int b) {
    char t = x[a];
    x[a] = x[b];
    x[b] = t;
  }
}
