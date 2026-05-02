import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans1 = 0;
        int ans2 = 0;
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans1 = i;
                    ans2 = j;
                }
            }
        }
        arr[0] = ans1;
        arr[1] = ans2;
        return arr; 
        
    }
}






// HashMap<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i]; 
            
             
//             if (map.containsKey(complement)) {
//                 return new int[]{ map.get(complement), i };
//             }
            
             
//             map.put(nums[i], i);
//         }
//         throw new IllegalArgumentException("No two sum solution");



