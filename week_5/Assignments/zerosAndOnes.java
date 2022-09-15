package week_5.Assignments;

public class zerosAndOnes {

  /**
   * The maximum number of strings that can be formed with m 0's and n 1's from the first i strings is
   * equal to max(1 + the maximum number of strings that can be formed with m - number of 0's in the
   * ith string and n - number of 1's in the ith string from the first i - 1 strings, the maximum
   * number of strings that can be formed with m 0's and n 1's from the first i - 1 strings)
   *
   * @param strs the array of strings
   * @param m number of 0's
   * @param n number of 1's
   * @return The length of the maximum subset of strings that can be formed with m 0's and n 1's.
   */
  public int findMaxForm(String[] strs, int m, int n) {
    Integer[][][] dp = new Integer[strs.length + 1][m + 1][n + 1];
    return getMaxSubSetLen(strs, 0, m, n, dp);
  }

  // This is the recursive function that is used to find the maximum number of strings that can be
  // formed with m 0's and n 1's from the first i strings.
  private static int getMaxSubSetLen(
    String[] str,
    int index,
    int m,
    int n,
    Integer[][][] dp
  ) {
    if (index == str.length) {
      return 0;
    }
    if (m == 0 && n == 0) return 0;

    if (dp[index][m][n] != null) return dp[index][m][n];
    //pick up
    int m1 = m;
    int n1 = n;
    int op1 = 0;
    int op2 = 0;
    boolean flag = true;
    for (int i = 0; i < str[index].length(); i++) {
      if (str[index].charAt(i) == '0' && m1 > 0) {
        m1--;
      } else if (str[index].charAt(i) == '1' && n1 > 0) n1--; else {
        flag = false;
        break;
      }
    }
    if (flag) op1 = 1 + getMaxSubSetLen(str, index + 1, m1, n1, dp);
    //non-pick
    op2 = getMaxSubSetLen(str, index + 1, m, n, dp);
    return dp[index][m][n] = Math.max(op1, op2);
  }
}
