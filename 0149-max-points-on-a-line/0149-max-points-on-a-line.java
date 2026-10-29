class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n==1){
            return 1;
        }
        int result = 0;
        for(int i=0;i<n;i++){     // point 1 (x1,y1)
            for(int j=i+1;j<n;j++){       // point 2 (x2,y2)
                int count = 2;
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                // dy/dx = dy_/dx_
                // dy*dx_ == dy_*dx

                for(int k=0;k<n;k++){
                    if(k!=i && k!=j){
                        int dx_ = points[k][0] - points[i][0];
                        int dy_ = points[k][1] - points[i][1];
                        if(dy*dx_ == dy_*dx){
                            count++;
                        }
                    }
                }
                result = Math.max(count,result);
            }
        }
        return result;
    }
}

// 2 nested loops for finding slope and another nested loop for checking if the third point has the same 
// slope or not 






