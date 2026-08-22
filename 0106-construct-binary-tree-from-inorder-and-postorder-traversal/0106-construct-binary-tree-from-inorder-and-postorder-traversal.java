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
    int ind=0;
    HashMap<Integer,Integer> mp=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=postorder.length;
        ind=n-1;

        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        
        return solve(postorder,0,n-1);
    }

    public TreeNode solve(int[] postorder,int start,int end){
        if(start>end) return null;

        int root_val=postorder[ind--];

        int i=mp.get(root_val);

        TreeNode root=new TreeNode(root_val);
        root.right=solve(postorder,i+1,end);
        root.left=solve(postorder,start,i-1);


        return root;
    }
}