class Solution {
    public int func(int[][] pairs,int i,int[] dp){
        int id = pairs.length;
        if(i>=id){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=i+1;j<pairs.length;j++){
            if(pairs[j][0]>pairs[i][1]){
                id=j;
                break;
            }
        }
        int a = 1+func(pairs,id,dp);
        int b = func(pairs,i+1,dp);
        return dp[i]=Math.max(a,b);
    }
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return func(pairs,0,dp);
    }
}

