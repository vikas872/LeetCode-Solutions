class Solution {
    
    // 1. This function visits every node in the tree (The "Manager")
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        
        // Count paths starting from THIS node
        // + Count paths starting from ANY node in left subtree
        // + Count paths starting from ANY node in right subtree
        return countPaths(root, targetSum, 0) 
             + pathSum(root.left, targetSum) 
             + pathSum(root.right, targetSum);
    }

    // 2. This function only counts paths starting at the specific 'node' given (The "Worker")
    private int countPaths(TreeNode node, int target, long currentSum) {
        if (node == null) {
            return 0;
        }

        currentSum += node.val;
        
        int count = 0;
        if (currentSum == target) {
            count = 1;
        }
        
        // Note: We don't return immediately if (currentSum == target). 
        // We continue because nodes can be 0 or negative (e.g., path is 8 -> -5 -> 5, sum is still 8)
        return count + countPaths(node.left, target, currentSum) 
                     + countPaths(node.right, target, currentSum);
    }
}