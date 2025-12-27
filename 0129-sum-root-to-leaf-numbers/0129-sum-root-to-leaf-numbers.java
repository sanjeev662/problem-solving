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
    public int sumNumbers(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        int tempans=0;
        if(root==null) return 0;

        pathSum(ans,tempans,root); 
        int result=0;
        for(int an : ans)  {
            result+=an;
        }
        return result;    
    }

    public void pathSum(List<Integer> ans,int tempans,TreeNode root){
        if(root==null) return;
        tempans=tempans*10+root.val;

        if(root.left==null && root.right==null){
            ans.add(tempans);
        }

        pathSum(ans,tempans,root.left); 
        pathSum(ans,tempans,root.right);
    }
}