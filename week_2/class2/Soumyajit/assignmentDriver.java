package week_2.class2.Soumyajit;

import java.util.ArrayList;
import java.util.Arrays;

public class assignmentDriver {

  public int addDigits(int num) {
    return (num - 1) % 9 + 1;
  }

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

  public boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;
    if (n == 1 || n == 2) return true;
    if (n % 2 != 0) return false;
    return isPowerOfTwo(n / 2);
  }

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

  public int getLucky(String s, int k) {
    int sum = 0;
    int ans = 0;
    for (char a : s.toCharArray()) {
      sum += (a - 'a' + 1) % 10 + (a - 'a' + 1) / 10;
    }
    System.out.println(sum);
    k--;
    while (k > 0 && sum > 0) {
      ans += sum % 10;
      sum /= 10;
      if (sum == 0) {
        sum = ans;
        ans = 0;
        k--;
      }
    }
    return sum;
  }

  public int thirdMax(int[] nums) {
    long max1 = nums[0];
    long max2 = Long.MIN_VALUE;
    long max3 = Long.MIN_VALUE;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max1) {
        max3 = max2;
        max2 = max1;
        max1 = nums[i];
      } else if (nums[i] > max2 && nums[i] < max1) {
        max3 = max2;
        max2 = nums[i];
      } else if (nums[i] > max3 && nums[i] < max2) {
        max3 = nums[i];
      }
    }

    if (max3 != Long.MIN_VALUE) return (int) max3;
    return (int) max1;
  }
}
