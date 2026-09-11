import java.util.*;
class Solution {
    public int[] dp = new int[400];
    public int func(int i, int[] days,int[] costs){

        if(i>=days.length){
            return dp[i];
        }
        int curr = days[i];
        int one = costs[0] + func(i+1,days,costs);
        int idx1 = days.length;
        int idx2 = days.length;
        int seven = 0;
        int thirty = 0;
        if(dp[i]!=0){
            return dp[i];
        }
        for(int j=i+1;j<days.length;j++){
            if(days[j]>=curr+7){
                idx1 = j;
                break;
            }
        }
        for(int j=i+1;j<days.length;j++){
            if(days[j]>=curr+30){
                idx2 = j;
                break;
            }
        }
        seven = costs[1] + func(idx1,days,costs);
        thirty = costs[2] + func(idx2,days,costs);
        int a = Math.min(one,seven);
        return dp[i] = Math.min(a,thirty);
    }
    public int mincostTickets(int[] days, int[] costs) {
        int n = dp.length;
        Arrays.fill(dp,0);
        return func(0,days,costs);
    }
}



