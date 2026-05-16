import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans1 = 0;
        int ans2 = 0;
        // int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans1 = i;
                    ans2 = j;
                }
            }
        }
        // arr[0] = ans1;
        // arr[1] = ans2;
        return new int[]{ans1,ans2};
    }
}





//         int left = 0;
//         int right = nums.length-1;
//         while(left<right){
//             if(nums[left]+nums[right]==target){
//                 ans1 = left;
//                 ans2 = right;
//                 break;
//             }
//             else if(nums[left]+nums[right]<target){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }


