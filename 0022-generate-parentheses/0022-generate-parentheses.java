class Solution {
    public void func(List<String> ans, String s, int n, int a, int b){
        // List<String> ans = new ArrayList<>();
        if(a<b){
            return;
        }
        if(a>n || b>n){
            return;
        }
        if (s.length()==2*n) {
            ans.add(s);
            return ;
        }
        func(ans, s + "(", n, a + 1, b);
        func(ans, s + ")", n, a, b+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        func(ans,"",n,0,0);
        return ans;
    }
}


