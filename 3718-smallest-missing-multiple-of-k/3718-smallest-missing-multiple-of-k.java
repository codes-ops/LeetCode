class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = k;
        for(int i=0;i<n;i++){
            if(nums[i]==a){
                a = a + k;
            }
        }
        return a;
    }
}





// if(nums[i]==k){
//                 return k;
//             } 




