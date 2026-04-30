import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                ans = nums[i-1];
            }
        }
        return ans;
    }
}