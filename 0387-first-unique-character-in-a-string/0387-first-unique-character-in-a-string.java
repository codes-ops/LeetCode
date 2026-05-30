import java.util.Arrays;
class Solution {
    public int firstUniqChar(String s) {
    int n = s.length();
    int[] arr = new int[26];
    for(int i=0;i<n;i++){
        arr[s.charAt(i) - 'a']++;
    }
    // Arrays.sort(arr);
    for(int i = 0;i<n;i++){
        if(arr[s.charAt(i) - 'a']==1){
            return i;
        }
    }
    return -1;
    }
}



// for(int i=0;i<n;i++){
//         int count = 0;
//         for(int j=0;j<n;j++){
//             if(s.charAt(i)==s.charAt(j)){
//                 count++;
//             }
//         }
//         if(count==1){
//             return i;
//         }
//     }
//     return -1;






// int left = 0;
//     while(left<n){
//         int right = 0;
//         int count = 0;
//         if(s.charAt(left)==s.charAt(right)){
//             count++;
//             left++;
//         }
//         right++;
//     }







