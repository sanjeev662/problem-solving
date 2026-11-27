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

    Map<Long,Integer> mp=new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        mp.put(0L, 1);
        return dfs(root,0L,targetSum);
    }

    public int dfs(TreeNode root,long prefixSum, int targetSum){
        if(root==null) return 0;

        prefixSum+=root.val;

        int count=mp.getOrDefault(prefixSum-targetSum,0);

        mp.put(prefixSum,mp.getOrDefault(prefixSum,0)+1);

        count+=dfs(root.left,prefixSum,targetSum);
        count+=dfs(root.right,prefixSum,targetSum);

        mp.put(prefixSum,mp.get(prefixSum)-1);

        return count;
    }

}