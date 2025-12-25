class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // subtract current node value
        targetSum -= root.val;

        // leaf node
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        return hasPathSum(root.left, targetSum) ||
               hasPathSum(root.right, targetSum);
    }
}
