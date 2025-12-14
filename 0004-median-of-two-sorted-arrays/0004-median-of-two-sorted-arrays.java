import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(nums1[i]);
            }
        for(int i=0;i<m;i++){
            arr.add(nums2[i]);
            }
            Collections.sort(arr);
            int a = arr.size();
            if(a%2==0){
                int b = a/2 - 1;
                int c = a/2;
                double sum = (arr.get(b) + arr.get(c))/2.0;
                return sum;
            }
            else{
                return arr.get(a/2);
            }

    }
}


