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
    List<Integer> ls=new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return new LinkedList<>();
        }
        inorderTraversal(root.left);
        ls.add(root.val);
        inorderTraversal(root.right);
        return ls;
    }
}