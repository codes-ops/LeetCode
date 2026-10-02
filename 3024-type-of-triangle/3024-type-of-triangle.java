class Solution {
    public String triangleType(int[] nums) {
        String ans = "scalene";

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if(a+b<=c || b+c<=a || c+a<=b){
            ans="none";
            return ans;
        }

        if(a==b && b==c){
            ans = "equilateral";
            return ans;
        }
        if(a==b || b==c || c==a){
            ans = "isosceles";
            return ans;
        }
        return ans;
    }
}
