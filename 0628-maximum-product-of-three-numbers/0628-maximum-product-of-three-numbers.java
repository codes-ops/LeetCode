import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
            
    }
}


//         int s_max = Integer.MIN_VALUE;
//         int t_max = Integer.MIN_VALUE;
//         if(n == 3 && nums[0]==nums[1]){
//             return nums[0]*nums[1]*nums[2];
//         }
//         for(int i=0;i<n;i++){
//             if(nums[i]>max){
//                 max = nums[i];
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(nums[i]>s_max && nums[i]<max){
//                 s_max = nums[i];
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(nums[i]>t_max && nums[i]<s_max){
//                 t_max = nums[i];
//             }
//         }
//         return max*t_max*s_max;    

// int max = Integer.MIN_VALUE;


