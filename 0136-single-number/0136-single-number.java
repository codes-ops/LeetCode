class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int ans = 0;
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            int j=0;
            while(j<n){
                if(i==j){
                    j++;
                    continue;
                }
                if(nums[i]==nums[j]){
                    count++;
                }
                j++;
            }
            if(count==0){
                ans = nums[i];
            }
            else{
                count = 0;
            }
        }
        return ans;
    }
}




