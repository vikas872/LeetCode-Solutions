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
    int maxSum = Integer.MIN_VALUE;
    private int sum(TreeNode root){
        if(root==null){
            return 0;
        }
     int l = Math.max(0, sum(root.left));
        int r = Math.max(0, sum(root.right));
        int neeche_hi = l+r+root.val;
        // int only_root = root.val;
        // int l_or_r = Math.max(l,r);
        maxSum = Math.max(maxSum,neeche_hi);
        // int ans = Math.max(only_root, l_or_r);
        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        sum(root);
        return maxSum;    }
}