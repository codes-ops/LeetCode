class Solution {
    public int lengthOfLastWord(String s) {
        String str = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int k = 0;
        int count = 0;
        while(k<n && str.charAt(k) == ' '){
            k++;
        }
        while(k<n && str.charAt(k) != ' '){
            count++;
            k++;
        }


    return count;
        
    }
}




