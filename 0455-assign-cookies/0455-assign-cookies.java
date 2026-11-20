class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int i=0;
        int j=0;
        while(i<n && j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    return i;
        
    }
}





