package class_2.Soumyajit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimum_absolute_difference {
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
}
