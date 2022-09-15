import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> answer = new ArrayList<Integer>();

        int left = 0, right = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;

        while (left < len1 && right < len2) {

            if (nums1[left] == nums2[right]) {
                answer.add(nums1[left]);
                left++;
                right++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            } else
                left++;
        }

        int[] answer_ret = new int[answer.size()];
        for (int index = 0; index < answer.size(); index++) {
            answer_ret[index] = answer.get(index);
        }
        return answer_ret;
    }
}
