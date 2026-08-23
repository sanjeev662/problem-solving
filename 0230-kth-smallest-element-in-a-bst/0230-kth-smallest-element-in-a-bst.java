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
    List<Integer> inorderls=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorderdfs(root);
        return inorderls.get(k-1);
    }

    public void inorderdfs(TreeNode root){
        if(root==null) return;
        inorderdfs(root.left);
        inorderls.add(root.val);
        inorderdfs(root.right);
    }
}