/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode BS(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BS (nums,left,mid-1);
        root.right = BS (nums,mid+1,right);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int n =nums.length;
        return BS(nums,0,n-1);
    }
}











