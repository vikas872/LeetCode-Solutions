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
       public int postInd;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postInd = postorder.length-1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,0,inorder.length-1,map);
    }

    public TreeNode helper(int[] postorder, int inStart, int inEnd, Map<Integer,Integer> map){
        if(inStart>inEnd){
            return null;
        }
        int rootVal = postorder[postInd--];
        TreeNode root =new TreeNode(rootVal);
        int mid = map.get(rootVal);

        root.right = helper(postorder,mid+1,inEnd,map);
        root.left = helper(postorder,inStart,mid-1,map);
        return root;
    }
}