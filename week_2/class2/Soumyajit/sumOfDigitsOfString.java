package week_2.class2.Soumyajit;

public class sumOfDigitsOfString {

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
}
