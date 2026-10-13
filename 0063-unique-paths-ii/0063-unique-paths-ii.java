class Solution {
    public int func(int i,int j,int[][] arr,int[][] dp){
        int n = arr.length;
        int m = arr[0].length;
        if(i>=n || j>=m){
            return 0;
        }
        if(arr[i][j]==1){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        // int a = func(i-1,j,arr);    // up
        int b = func(i+1,j,arr,dp);    // down
        // int c = func(i,j-1,arr); // left
        int d = func(i,j+1,arr,dp); // right

        return dp[i][j]=b+d;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return func(0,0,obstacleGrid,dp);
    }
}



