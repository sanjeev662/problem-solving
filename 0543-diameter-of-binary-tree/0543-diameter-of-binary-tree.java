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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int dial=diameterOfBinaryTree(root.left);
        int diar=diameterOfBinaryTree(root.right);
        int dia1=height(root.left)+height(root.right);
        return Math.max(Math.max(dial,diar),dia1);
    }

    public int height(TreeNode root){
        if(root==null) return 0;
        return Math.max(height(root.left)+1,height(root.right)+1);
    }
}