package week_2.class2.Soumyajit;

public class thirdMaximumNumber {

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
