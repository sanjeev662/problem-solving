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

       List<Integer> list=new ArrayList<>();

       while(!q.isEmpty()){
        TreeNode temp=q.remove();

        if(temp==null){
            ans.add(new ArrayList(list));
            list.clear();

            if(q.size()>0){
                q.offer(null);
            }
        }else{
            list.add(temp.val);
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
        }
       }

       return ans;
    }
}