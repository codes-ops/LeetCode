import java.util.*;
class Solution {
    public int func(String s){
        int cost = 0;
        int i=0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                int diff = Math.abs(s.charAt(i) - s.charAt(j));
                int c1 = diff;
                int c2 = 26 - diff;
                cost = cost + Math.min(c1,c2);
            }
            i++;
            j--;
        }
        return cost;

    }
    public int minOperations(String s) {
        StringBuilder st = new StringBuilder(s);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            int a = i + func(st.toString());
            min = Math.min(a, min);
            // left rotations
            char c = st.charAt(0);
            st.deleteCharAt(0);
            st.append(c);

        }
        return min;
    }
}



// List<String> generatedStrings = new ArrayList<>();
//         for(int i=0;i<s.length();i++){
//             char c = st.charAt(0);
//             st.deleteCharAt(0);
//             st.append(c);
//             generatedStrings.add(st.toString()); 
//         }

// st = st + st.CharAt(0);
// st.deleteCharAt(0);
// char arr[] = str.toCharArray();

//         for(int i=0;i<n;i++){
            
//         }





