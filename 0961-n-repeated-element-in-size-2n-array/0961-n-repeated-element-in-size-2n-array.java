class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=n/2){
                ans = nums[i];
            }
            // else{
            //     count = 0;
            // }
        }
        return ans;
    }
}



