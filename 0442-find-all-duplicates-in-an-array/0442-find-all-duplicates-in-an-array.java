import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                arr.add(nums[i]);
            }
        }
        
        return arr;
    }
}


// for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     arr.add(nums[j]);
//                 }
//             }
//         }



// for(int left=0;left<n;left++){
//             int count = 0;

            
//             for(int right=0;right<n;right++){
//                 if(nums[left]==nums[right]){
//                     count++;
//                 }
//             }
//             if (count>1) {
//                     arr.add(nums[left]);
//                 }
//         }


// int left = 0;
//         int right = n-1;
//         if(n==1){
//             // arr.add(nums[0]);
//             return arr;
//         }
//         else{
//             while(left<=right){
//             if(nums[left]==nums[right]){
//                 arr.add(nums[right]);
//             }
//             left++;
//             right--;
//         }
//         }

