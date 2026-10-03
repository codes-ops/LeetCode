class Solution {
    public int func(int idx,int n,int k,ArrayList<Integer> nums){
        if(n==1){
            return nums.get(0);
        }
        int a = idx + k - 1;
        while(a>=n){
            a = a - n;
        }
        // if(k==n){
        //     nums.remove(k);
        //     return func(idx+k+1,n-1,k,nums);
        // }
        nums.remove(a);
        idx = a;
        if(idx>=n-1){
            idx = 0;
        }
        return func(idx,n-1,k,nums);

    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        return func(0,n,k,nums);
    }
}




