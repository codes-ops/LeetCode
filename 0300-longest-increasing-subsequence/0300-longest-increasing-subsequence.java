class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int a:nums){
            if(temp.size()==0 || a>temp.getLast()){
                temp.add(a);
            }
            else{
                for(int j=0;j<temp.size();j++){
                    if(temp.get(j)>=a){
                        temp.set(j,a);
                        break;
                    }
                }
            }
        }
        return temp.size();
    }
}



    //     if(i>=n){
    //         return 0;
    //     }
    //     int m = 1;   
    //     // int a = 0;
    //     // int b = 0;
    //     for(int j=i+1;j<n;j++){
    //         if(nums[j]>nums[i]){
    //             int a = 1+func(j,nums);
    //             m = Math.max(m,a);
    //         }
    //     }
    //     return m;
    // }







