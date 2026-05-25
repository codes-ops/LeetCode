class Solution {
    public int differenceOfSums(int n, int m) {
        int div = 0;
        int ndiv = 0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                div = div + i;
            }
            else{
                ndiv = ndiv + i;
            }
        }
        return ndiv - div;
        
    }
}






// int count_one = 0;
//         int count_two = 0;
//         int num = 1;
//         int num2 = 0;
//         int num1 0;

//         while(num<=n){
//             if(num%3==0){
//                 num1 = num1 + count_one;
//             }
//             else{
//                 num1 = num1 + count_one;
//             }
//         }





