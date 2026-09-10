class Solution {
    HashMap<Integer,Boolean> map = new HashMap<>();
    public boolean func(int i,List<String> wordDict,String s){
        if(i==s.length()){
            return true;
        }

        if(map.containsKey(i)){
            return map.get(i);
        }

        for(int j=0;j<wordDict.size();j++){
             String temp = wordDict.get(j);
             if(i+temp.length()<=s.length()){     
                String temp_two = s.substring(i,i+temp.length());
                if(temp_two.equals(temp)){
                if (func(i + temp.length(), wordDict, s)) {
                        map.put(i, true);
                        return true;
                    }
                }
             }
         }
        map.put(i,false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return func(0, wordDict, s);
    }
}

// int n = s.length();
        // for(int i=0;i<m;i++){
        //     int j=0;
        //     int m = wordDict[j].length();
        //     StringBuilder temp = new StringBuilder();
        //     temp.append(s.charAt(i));
        //     if(temp.toString().equals(s)){
                
        //     }
        // }





//          for(int j=0;j<wordDict.size();j++){
//             String temp = wordDict.get(j);
//             if(temp.length()<s.length()){     
//                 String temp_two = s.substring(i,i+temp.length());
//             }
//             if(temp_two.equals(temp)){
//                 func(i,wordDict,s);
//                 return true;
//             }
//             return false;
//         }













