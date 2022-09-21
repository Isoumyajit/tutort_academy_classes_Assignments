package week_5.Assignments;

public class singleNumber {
    public int singleNumberI(int[] nums) {
        
        int ans = 0 ; 
        for(int val : nums)ans ^= val;
        return ans;

    }
}
