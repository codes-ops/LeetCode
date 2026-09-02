import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                k++;
            }
        }
        // int[] arr = new int[size];
        // int sum = (size * (size+1))/2;
    return k;
    }
}


// int count = 0;
//         Arrays.sort(nums);
//         int diff = nums[1] - nums[0];
//         int n = nums.length;
//         for(int i=1;i<n;i++){
//             int difference = nums[i]-nums[i-1];
//             if(difference>diff){
//                 count++;
//             }
//         }
//         return count;
