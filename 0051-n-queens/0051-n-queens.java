class Solution {
    List<List<String>> ans = new ArrayList<>();
    public boolean check(int n,int i,int j,char[][] arr){
        for(int k=0;k<n;k++){   // column
            if(arr[k][j]=='Q'){
                return false;
            }
        }
        int a = i-1;
        int b = j-1;
        while(a>=0 && b>=0){     // upper-left diagonal
            if(arr[a][b]=='Q'){
                return false;
            }
            a--;
            b--;
        }
        a = i-1;
        b = j+1;
        while(a>=0 && b<n){       // upper-right diagonal
            if(arr[a][b]=='Q'){
                return false;
            }
            a--;
            b++;
        }
        return true;

    }
    public void func(int i,char[][] arr){
        int n = arr.length;
        if(i==n){
            List<String> board = new ArrayList<>();
            for (int x = 0; x < n; x++) {
                board.add(new String(arr[x]));
            }
            ans.add(board);
            return;
        }
        for(int j=0;j<n;j++){
            if(check(n,i,j,arr)){
                arr[i][j] = 'Q';
                func(i+1,arr);
                arr[i][j] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        // <List<List<String>> mat = new Arraylist<>(n);
        // List<String> str = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     mat.add(new ArrayList<>(Collections.nCopies(n, ".")));
        // }
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = '.';
            }
        }
        func(0,arr);
        return ans;
    }
}




