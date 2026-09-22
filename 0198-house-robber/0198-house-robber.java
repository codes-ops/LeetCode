import java.util.*;
class Solution {
    public int func(int i,int[] nums,int n,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int a = nums[i] + func(i+2,nums,n,dp);
        int b = func(i+1,nums,n,dp);

        return dp[i] = Math.max(a,b);

    }
    public int rob(int[] nums) {
        int money = 0;
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = func(0,nums,n,dp);
        return ans;
    }
}


// for(int i = 0;i<nums.length;i=i+2){
//             // int a = 0;
//             for(){

//             }
//         }












