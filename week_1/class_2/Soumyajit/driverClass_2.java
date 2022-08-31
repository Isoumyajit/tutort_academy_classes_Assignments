package class_2.Soumyajit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class driverClass_2 {
    static jewels_stones obj1 = new jewels_stones();
    majorityElement obj2 = new majorityElement();
    consecutiveOdds obj3 = new consecutiveOdds();
    minimum_absolute_difference obj4 = new minimum_absolute_difference();
    moveZeros obj5 = new moveZeros();
    richest_customer_wealth obj6 = new richest_customer_wealth();
    running_sum obj7 = new running_sum();
    transpose obj8 = new transpose();

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3)
            return false;
        for (int i = 0, count = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
                if (count == 3)
                    return true;
            } else
                count = 0;
        }
        return false;
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] hash = new int[256];
        for (char x : jewels.toCharArray())
            hash[x]++;

        for (char x : stones.toCharArray())
            if (hash[x] > 0) {
                count++;
            }

        return count;
    }

    public int majorityElement_(int[] nums) {

        int num1 = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (num1 == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    num1 = nums[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num1 == nums[i])
                count++;
        }
        return num1;
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList<>();
        int minimum_dif = Integer.MAX_VALUE;
        int minIndex = 0;
        ArrayList<Integer> dummy = null;
        for (int i = 1; i < arr.length; i++) {
            if (minimum_dif > Math.abs(arr[i] - arr[i - 1])) {
                minimum_dif = Math.abs(arr[i] - arr[i - 1]);
                minIndex = i;
            }

        }
        for (int i = minIndex; i < arr.length; i++) {
            if (minimum_dif == Math.abs(arr[i] - arr[i - 1])) {
                dummy = new ArrayList<>();
                dummy.add(arr[i - 1]);
                dummy.add(arr[i]);
                answer.add(dummy);
            }

        }
        return answer;
    }

    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] a : accounts) {
            int wealth = 0;
            for (int money : a) {
                wealth += money;
            }
            max = Math.max(max, wealth);
        }
        return max;
    }

    public int[] runningSum(int[] nums) {

        int sum = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }

        return ans;
    }

    public int[][] transposeMat(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
