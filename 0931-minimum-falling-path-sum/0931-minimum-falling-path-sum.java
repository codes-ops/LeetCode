class Solution {
    public int func(int n,int i,int j,int[][] matrix,int[][] dp){
        if(j<0 || j>=n){
            return (int)1e9;
        }
        if(i==n-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=-(int)1e9){
            return dp[i][j];
        }
        int a = func(n,i+1,j-1,matrix,dp);
        int b = func(n,i+1,j,matrix,dp);
        int c = func(n,i+1,j+1,matrix,dp);
        return dp[i][j]=matrix[i][j] + Math.min(c,Math.min(a,b));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-(int)1e9;
            }
        }
        for(int i=0;i<n;i++){
            ans = Math.min(ans,func(n,0,i,matrix,dp));
        }
        return ans;
    }
}

// i >>> rows;
// j >>> col;




