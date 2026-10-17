class Solution {
    public int func(int n){
        if(n==0){
            return 0;
        }
        // int[] dp = new int[n+1];
        int prev = 0;
        int next = 1;
        for(int i=2;i<=n;i++){
            int curr = prev + next;
            prev = next;
            next = curr;
        }
        return next;
    }
    public int fib(int n) {
        return func(n);
    }
}









