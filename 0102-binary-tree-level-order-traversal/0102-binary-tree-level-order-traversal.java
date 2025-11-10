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
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null) return ans;

        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        que.add(null);
        List<Integer> tempans=new LinkedList<>();
        while(!que.isEmpty()){
            TreeNode temp=que.remove();
            if(temp==null){
                ans.add(new LinkedList<>(tempans)); // ✅ add a *copy* of the list
                tempans.clear();
                if(que.isEmpty()) break;
                else que.add(null);
            }else{
                tempans.add(temp.val);
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
            }
        }
        return ans;
    }
}