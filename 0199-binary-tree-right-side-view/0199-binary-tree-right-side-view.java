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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls=new LinkedList<>();
        if (root == null) return ls;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        TreeNode tt=null;
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            if(temp==null){
                if(tt!=null) ls.add(tt.val);
                if(q.isEmpty()) break;
                q.add(null);
            }else{
                tt=temp;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
        return ls;
    }
}