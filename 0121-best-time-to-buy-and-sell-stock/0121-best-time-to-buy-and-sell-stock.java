class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int index = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
               min = prices[i];
            }
            int profit = prices[i] - min;
            if(profit>max){
                max = profit;
            }
        }
        // for(int i=index;i<n;i++){
        //     if(prices[i]>max){
        //         max = prices[i];
        //     }
        // }


        return max;
    }
}




// for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 diff = prices[i] - prices[j];
//                 if(diff>max){
//                     max = diff;
//                 }
//             }
//         }





