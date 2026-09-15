class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        ArrayList<Integer> nums = new ArrayList<>();
        int n = points.length;
        int m = queries.length;
        for(int i=0;i<m;i++){
            int count = 0;
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];
            for(int j=0;j<n;j++){
                int h = points[j][0];
                int k = points[j][1];
                int a = ((x-h)*(x-h)) + ((y-k)*(y-k));
                int b = r*r;
                if(a<=b){
                    count++;
                }
            }
            nums.add(count);
        }        

        int[] ans = nums.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}




// (x-h)^2 + (y-k)^2 = r^2













// x^2 + y^2 + 2gx + 2fy + c = 0 (r = root(g^2 + f^2 - c))
// x^2 + y^2 = r^2



