package week_5.Assignments;

import java.util.ArrayList;
import java.util.List;

public class findAllNumbersDisappearedInArray {

  /**
   * We're going to iterate through the array, and for each element, we're going to make the element at
   * the index of the element's value negative.
   *
   * For example, if we have an array of [4,3,2,7,8,2,3,1], we're going to iterate through the array,
   * and for each element, we're going to make the element at the index of the element's value
   * negative.
   *
   * So, for the first element, 4, we're going to make the element at index 4 negative.
   *
   * For the second element, 3, we're going to make the element at index 3 negative.
   *
   * For the third element, 2, we're going to make the element at index 2 negative.
   *
   * For the fourth element, 7, we're going to make the element at index 7 negative.
   *
   * For the fifth element, 8, we're going to do the same and so forth so on.......
   *
   * @param nums [4,3,2,7,8,2,3,1]
   * @return The numbers that are missing from the array.
   */
  public List<Integer> findDisappearedNumbers(int[] nums) {
    int end = 0;
    int n = nums.length;

    while (end < n) {
      int index = Math.abs(nums[end] - 0);
      if (nums[index - 1] >= 1) nums[index - 1] *= -1;
      end++;
    }
    List<Integer> answer = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 1) {
        answer.add(i + 1);
      }
    }
    return answer;
  }
}
