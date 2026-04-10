class Solution {
    public int sumOfMultiples(int n) {
        int count = 1;
        int sum = 0;
        while(count<=n){
            if(count%3==0 || count%5==0 || count%7==0){
                sum = sum + count;
            }
            count++;
        }
        return sum;
    }
}


