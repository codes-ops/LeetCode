import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                ans = true;
            }
        }
        return ans;
    }
}
// int left = 0;
//         int right = 0;
//         while(left<=right){
//             // int right = left+1;
//             if(nums[left]==nums[right]){
//                 ans = true;
//                 break;
//             }
//         }

// for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     ans = true;
//                 }
//             }
//         }



