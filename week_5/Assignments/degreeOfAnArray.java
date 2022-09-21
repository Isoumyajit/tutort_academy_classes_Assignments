package week_5.Assignments;

import java.util.HashMap;
import java.util.Map;

public class degreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();
        int degree = 0 ;
        int maxFreq = 0 ;
        int length = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0 ) + 1);
            left.putIfAbsent(nums[i], i );
            degree = map.get(nums[i]);
            if(maxFreq < degree){
                maxFreq = degree;
                length = i - left.get(nums[i]) + 1;
            }
            else if(maxFreq == degree){
                if(length > (i - left.get(nums[i]) + 1))length = i - left.get(nums[i]) + 1;
            }
            
        }
        return length;
        
        
    }
}
