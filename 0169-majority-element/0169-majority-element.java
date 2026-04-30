import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority_element = -1;
        Arrays.sort(nums);
        majority_element = nums[n/2];

        return majority_element;
    }
}




// -----------TIME LIMIT EXCEEDED--------
//         int n = nums.length;
//         int majority_element = -1;
//         for(int i=0;i<nums.length;i++){
//             int count = 0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             int c = n/2;
//             if(count>c){
//                 majority_element = nums[i];
//             }
//         }


// int j=0;
//         for(int i=0;i<n;i++){
//             int count = 0;
//             if(j>=n || j==n-1){
//                 j=0;
//             }
//             if(nums[i]==nums[j]){
//                 count++;
//             }
//             int c = n/2;
//             if(count>c){
//                 majority_element = nums[i];
//             }
//             j++;
//        }



