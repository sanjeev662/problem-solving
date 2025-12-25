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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> tempans=new LinkedList<>();

        if(root==null) return ans;

        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        que.add(null);

        boolean leftToRight=true;

        while(!que.isEmpty()){
            TreeNode temp=que.remove();

            if(temp==null){
                ans.add(new LinkedList<>(tempans));
                tempans.clear();

                leftToRight =! leftToRight;

                if(que.isEmpty()) break;
                else que.add(null);
            }else{
                if(leftToRight) tempans.addLast(temp.val);
                else tempans.addFirst(temp.val);

                //we able to use addLast,addFirst in constant time complexity only because of LinkedList .. if we were using ArrayList it will take O(n) time

                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
            }

        }

        return ans;
    }
}