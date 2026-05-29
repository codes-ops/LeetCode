class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        int a = n;
        while(a!=0){
            int digit = a % 10;
            prod  = prod * digit;
            a = a / 10;
        }
        int b = n;
        while(b!=0){
            int digit = b % 10;
            sum  = sum + digit;
            b = b / 10;
        }
        return prod - sum;
    }
}





