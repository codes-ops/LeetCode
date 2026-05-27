import java.util.*;
class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int digit_sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            int temp = nums[i];
            while(temp>0){
                digit_sum = digit_sum + temp % 10;
                temp /= 10;
            }
        }

        return Math.abs(sum -  digit_sum);

    }
}



// for(int i=0;i<n;i++){
//             sum = sum + nums[i];
//         }
//         for(int i=0;i<n;i++){
//             if(nums[i]>=10){
//                 int a = nums[i] / 10;
//                 int b = nums[i] % 10;
//                 digit_sum = digit_sum + a + b;
//             }
//             else{
//                 digit_sum = digit_sum + nums[i];
//             }
//         }






