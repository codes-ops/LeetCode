class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int one = 0;
        int two = 0;
        int[] arr = new int[2];
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>1){
                two = nums[i-1] + 1;
            }
            else if(nums[i]==nums[i-1]){
                one = nums[i];
            }
        }
        if(nums[0]!=1){
            two = 1;
        }
        else if(nums[n-1]!=n){
            two = n;
        }
        arr[0] = one;
        arr[1] = two;
        return arr;
    }
}





