import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int max = 0;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0;i<n;i++){
            int a = candies[i] + extraCandies;
            if(a>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}


