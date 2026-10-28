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

        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        que.offer(null);

        List<Integer> ls=new ArrayList<>();

        while(!que.isEmpty()){
            TreeNode temp=que.remove();

            if(temp==null){
                ans.add(new ArrayList(ls));
                ls.clear();

                if(que.size()>0){
                    que.offer(null);
                }
            }else{
                ls.add(temp.val);
                if(temp.left!=null) que.offer(temp.left);
                if(temp.right!=null) que.offer(temp.right);
            }
        }

        return ans;
    }
}