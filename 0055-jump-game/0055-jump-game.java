class Solution {
    public boolean func(int i,int[] nums,Boolean[] memo){
        int n = nums.length;
        if(i==n-1){
            return true;
        }
        if(i>=n){
            return false;
        }
        // if(nums[i]==0){
        //     return false;
        // }
        if(memo[i] != null){
            return memo[i];
        }
        for(int j=1;j<=nums[i];j++){
            boolean a = func(i+j,nums,memo);
            if(a){
                return memo[i]=true;
            }
        }

        return memo[i] = false;
    }
    public boolean canJump(int[] nums) {
        Boolean[] memo;
        memo = new Boolean[nums.length];
        return func(0,nums,memo);
    }
}



