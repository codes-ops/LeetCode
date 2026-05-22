class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        int sign = 0;
        int negative_count = 0;
        // int posotove_count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                negative_count++;
            }
            // if(nums[i]>0){
            //     posotove_count++;
            // }
        }
        if(negative_count%2==0){
            sign = 1;
        }
        if(negative_count%2!=0){
            sign = -1;
        }
        return sign;     
    }
}




// long prod = 1;
//         for(int i=0;i<n;i++){
//             prod = prod * nums[i];
//         }
//         if(prod<0){
//             sign = -1;
//         }
//         else if(prod==0){
//             sign = 0;
//         }   
//         else{
//             sign = 1;
//         }






