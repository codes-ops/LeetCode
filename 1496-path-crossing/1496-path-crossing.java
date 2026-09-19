class Solution {
    public boolean isPathCrossing(String path) {
        int n = path.length();
        int x = 0;
        int y = 0;
        HashSet set = new HashSet<>();
        set.add("0,0");
        for(int i=0;i<n;i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            if(path.charAt(i)=='S'){
                y--;
            }
            if(path.charAt(i)=='E'){
                x++;
            }
            if(path.charAt(i)=='W'){
                x--;
            }
            String a = x + "," + y;
            if(set.contains(a)){
                return true;
            }
            set.add(a);
        }
        return false;
    }
}



