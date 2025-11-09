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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new LinkedList<>();
        inorderT(root,ls);
        return ls;
    }

    public void inorderT(TreeNode root, List<Integer> ls){
        if(root==null) return;
        inorderT(root.left,ls);
        ls.add(root.val);
        inorderT(root.right,ls);
    }
}