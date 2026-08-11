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
        List<Integer> rv=new ArrayList<>();
        if(root==null) return rv;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);
        TreeNode tt=null;

        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp==null){
                if(tt!=null) rv.add(tt.val);
                if(q.isEmpty()) break;
                q.add(null);
            }else{
                tt=temp;
                if(tt.left!=null) q.offer(tt.left);
                if(tt.right!=null) q.offer(tt.right);
            }
        }
        return rv;
    }
}