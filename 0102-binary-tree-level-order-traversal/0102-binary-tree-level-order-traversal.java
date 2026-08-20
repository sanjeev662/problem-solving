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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);

        List<Integer> temp=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode top=q.remove();
            if(top==null){
                ans.add(new ArrayList<>(temp));
                temp.clear();
                if(q.size()>0)
                q.offer(null);
            }else{
                temp.add(top.val);

                if(top.left!=null){
                    q.offer(top.left);
                }

                if(top.right!=null){
                    q.offer(top.right);
                }
            }
        }

        return ans;
    }
}