class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        // int i = 0;
        // int j = 0;
        int count = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int sum = 0;
            if(nums[i]<9){
                arr[i] = nums[i];
            }
            else{
                while(nums[i]!=0){
                    int digit = nums[i] % 10;
                    sum = sum + digit;
                    nums[i] = nums[i] / 10;
                }
                arr[i] = sum;
            }
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}


// int sum = 0;
//             int a = nums[i];
//             while(nums[i]!=0){
//                 sum = sum + n % 10;
//             }
//             arr[i] = sum;









// while(count<n){
//             while(){
//                 sum = 
//                 arr[i] = nums[i] % 10;
//             }
//         count++;
//         }



