package week_2.class2.Soumyajit;

public class uglyNumber {

  public boolean isUgly(int n) {
    if (n == 1 || n == 0) return true;
    while (n > 0) n /= 2;
    if (n == 1) return true;
    while (n > 0) n /= 3;
    if (n == 1) return true;
    while (n > 0) n /= 5;
    if (n == 1) return true;
    return false;
  }
}
