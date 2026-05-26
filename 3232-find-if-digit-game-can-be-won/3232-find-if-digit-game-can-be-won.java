class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int single_sum = 0;
        int double_sum = 0;
        boolean ans = false;
        for(int i=0;i<n;i++){
            if(nums[i]>=10){
                double_sum = double_sum + nums[i];
            }
            else{
                single_sum = single_sum + nums[i];
            }
        }
        if(single_sum > double_sum || double_sum > single_sum){
            ans = true;
        }
        return ans;
    }
}

