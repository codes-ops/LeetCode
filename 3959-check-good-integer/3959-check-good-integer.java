class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sq_sum = 0;
        int a = n;
        int b = n;
        while(a>0){
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        while(b>0){
            int digit = b % 10;
            int c = digit * digit;
            sq_sum = sq_sum + c;
            b = b / 10;
        }
        int ans = sq_sum - sum;
        boolean res = false;
        if(ans>=50){
            res = true;
        }
        return res;
        
    }
}


