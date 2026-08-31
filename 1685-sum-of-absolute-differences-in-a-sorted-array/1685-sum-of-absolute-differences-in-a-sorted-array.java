class Solution {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int totalsum = 0;
        for (int num : nums) {
            totalsum += num;
        }
        int leftsum = 0;
        for (int i = 0; i < n; i++) {
            int rightsum = totalsum - leftsum - nums[i];

            int leftdiff = nums[i] * i - leftsum;

            int rightdiff =
                    rightsum - nums[i] * (n - i - 1);

            result[i] = leftdiff + rightdiff;

            leftsum += nums[i];
        }

        return result;
    }
}




// int n = nums.length;
//         int[] result = new int[n];

//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 result[i] = result[i] + Math.abs(nums[i] - nums[j]);
//             }
//         }
//         return result;










