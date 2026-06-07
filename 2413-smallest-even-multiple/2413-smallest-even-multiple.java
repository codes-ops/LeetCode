class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 0;
        int a = 1;
        while(true){
            if(a%2==0 && a%n==0){
                ans = a;
                break;
            }
            a++;
        }
        return ans;
    }
}

