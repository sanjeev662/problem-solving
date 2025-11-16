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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ls=new LinkedList<>();
        List<Integer> lsans=inOrderTraversal(root,ls);

        return lsans.get(k-1);
    }

    public List<Integer> inOrderTraversal(TreeNode root,List<Integer> ls){
        if(root==null) return ls;
        inOrderTraversal(root.left,ls);
        ls.add(root.val);
        inOrderTraversal(root.right,ls);
        return ls;
    }


}