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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return height(root) != -1;
        // int hl=height(root.left);
        // int hr=height(root.right);
        // if(Math.abs(hl-hr)>1) return false;

        // return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        if (l == -1) return -1;
        int r=height(root.right);
        if (r == -1) return -1;

        if(Math.abs(l-r)>1) return -1;
        return Math.max(l,r)+1;
    }
}