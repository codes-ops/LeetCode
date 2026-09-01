class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int diff[][] = new int[m][n];

        int[] onesrow = new int[m];
        int[] onescol = new int[n];

        // counting ones
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    onesrow[i]++;
                    onescol[j]++;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int zerosrow = n - onesrow[i];
                int zeroscol = m - onescol[j];
                diff[i][j] = onesrow[i] + onescol[j] - zerosrow - zeroscol;
            }
        }
        return diff;
    }
}


// diff[i][j] = onesrow + onescol - zerosrow - zeroscol;


// int onesrow = 0;
//         int onescol = 0;
//         int zerosrow = 0;
//         int zeroscol = 0;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 for(int k=0;k<n;k++){   // row
//                     if(grid[i][k]==0){
//                         zerosrow++;
//                     }
//                 }
//                 for(int k=0;k<n;k++){   // row
//                     if(grid[i][j]==0){
//                         onesrow++;
//                     }
//                 }
//                 for(int k=0;k<m;k++){
//                     if(grid[i][j]==1){
//                         onescol++;
//                     }

//                 }
//                 for(int k=0;k<m;k++){
//                     if(grid[i][j]==0){
//                         zeroscol++;
//                     }
//                 }
//             }
//         }






