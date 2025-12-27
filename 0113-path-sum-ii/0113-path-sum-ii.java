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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();

        if (root == null) return ans;

        dfs(ans,path,root,targetSum);

        return ans;
    }

    public void dfs(List<List<Integer>> ans, List<Integer> path, TreeNode root, int targetSum){
        if (root == null) {return;}

        targetSum -= root.val;
        path.add(root.val);

        if (root.left == null && root.right == null && targetSum==0) {
            ans.add(new ArrayList<>(path));
        }

        dfs(ans,path,root.left,targetSum);
        dfs(ans,path,root.right,targetSum);

        if(path.size()>0)
        path.remove(path.size() - 1);
    }
}