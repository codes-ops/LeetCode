class Solution {
    public boolean checkIfPangram(String sentence) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        // int n = sentence.length();
        // boolean ans = false;
        int n = s.length();
        int m = sentence.length();
        for(int i=0;i<n;i++){
            boolean ans = false;
            for(int j=0;j<m;j++){
                if(s.charAt(i)==sentence.charAt(j)){
                    ans = true;
                    break;
                }
            }
            if(!ans){
                return false;
            }
        }
        return true;
    }
}








