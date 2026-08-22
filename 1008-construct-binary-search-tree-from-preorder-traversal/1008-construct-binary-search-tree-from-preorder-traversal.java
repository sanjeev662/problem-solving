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
    int ind=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return solve(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public TreeNode solve(int[] preorder,int min,int max){
        if(ind>=preorder.length) return null;
        int root_val=preorder[ind];

        if(root_val>max || root_val<min){
            return null;
        }

        ind++;

        TreeNode root=new TreeNode(root_val);
        root.left=solve(preorder,min,root_val);
        root.right=solve(preorder,root_val,max);

        return root;
    }
}