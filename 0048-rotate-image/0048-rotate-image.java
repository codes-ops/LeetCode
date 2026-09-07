class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){  // transpose
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0;i<n;i++){ // reverse 
            for(int j=0;j<n/2;j++){
                // int left = nums[i][j];
                // int right = nums[i][n-1];
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;

            }
        }
        
    }
}





