class Solution {
    public boolean isSameAfterReversals(int num) {
        boolean ans = false;
        int rev1 = 0;
        int rev2 = 0;
        int a = num;
        while(num!=0){
            int digit = num % 10;
            rev1 = rev1 * 10 + digit;
            num = num / 10;
        }
        while(rev1!=0){
            int digit1 = rev1 % 10;
            rev2 = rev2 * 10 + digit1;
            rev1 = rev1 / 10;
        }
        if(rev2==a){
            ans = true;
        }
        return ans;
        
    }
}



