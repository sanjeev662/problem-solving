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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;

        int maxsum=root.val;
        int tempsum=0;
        int smallestlevel=1;
        int level=1;

        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        que.add(null);

        while(!que.isEmpty()){
            TreeNode temp=que.remove();

            if(temp==null){
                if(maxsum<tempsum){
                    maxsum=tempsum;
                    smallestlevel=level;
                }
                tempsum=0;
                if(que.isEmpty()) break;
                else {que.add(null); level++;}
            }else{
                tempsum+=temp.val;
                if(temp.left!=null){
                    que.add(temp.left);
                }
                if(temp.right!=null){
                    que.add(temp.right);
                }
            }
        }
        return smallestlevel;       
    }
}