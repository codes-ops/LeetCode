import java.util.*;
class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        // int[] arr = new int[n];
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        } 
        return nums;
        
    }
}



// int k = n;
        // int min = nums[0];
        // for(int i = 0;i<k;i++){
        //     if(nums[i]<min){
        //         min = nums[i];
        //     }
        //     k--;
        // }
        // for(){

        // }


// for(int i = 0;i<n;i++){
//             if(i==0){
//                 arr[0] = nums[1];
//             }
//             if(i%2!=0){
//                 arr[i] = nums[i-1];
//             }
//             else{
//                 arr[i] = nums[i];
//             }
//         }   






