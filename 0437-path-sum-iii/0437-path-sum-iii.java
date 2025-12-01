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
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        return count(root,sum,0) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }

    private int count(TreeNode  root, int sum, long curr){
        if(root==null){
            return 0;
        }
        curr+=root.val;
        int cnt = 0;
        if(curr==sum){
            cnt = 1;
        }

        return cnt + count(root.left,sum,curr) + count(root.right,sum,curr);
    }
}