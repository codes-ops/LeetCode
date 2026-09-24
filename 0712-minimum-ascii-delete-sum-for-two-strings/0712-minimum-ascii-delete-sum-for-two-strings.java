class Solution {
    public int func(int i,int j,String s1,String s2,int m ,int n,int[][] dp){
        // if(i>=n || j>=m){
        //     return 0;
        // }
        if(i>=n){
            int a = 0;
            while(j<m){
                a = a + s2.charAt(j);
                j++;
            }
            return a;
        }
        if(j>=m){
            int a = 0;
            while(i<n){
                a = a + s1.charAt(i);
                i++;
            }
            return a;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = func(i+1,j+1,s1,s2,m,n,dp);
        }
        int c1 = s1.charAt(i) + func(i+1,j,s1,s2,m,n,dp);
        int c2 = s2.charAt(j) + func(i,j+1,s1,s2,m,n,dp);


        return dp[i][j] = Math.min(c1,c2);
    }
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return func(0,0,s1,s2,m,n,dp);
    }
}


// int asciiValue = text.charAt(0);



