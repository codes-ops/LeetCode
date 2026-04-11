class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 0;
        if(n==2){
            max = (nums[0]-1)*(nums[1]-1);
        }
        // else if(n==1){
        //     max = nums[0];
        // }
        else{
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int prod = (nums[i]-1) * (nums[j]-1);
                    if(prod>max){
                        max = prod;
                        }
                    }
                }
            }
        return max;
    }
}

