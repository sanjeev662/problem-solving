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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        StringBuilder st=new StringBuilder();

        if(root==null) return ans;
        dfspath(ans,st,root);
        return ans;
    }

    public void dfspath(List<String> ans,StringBuilder st,TreeNode root){
        if(root==null) return;
        int len = st.length();
        st.append(root.val);

        if(root.left==null && root.right==null){
            ans.add(st.toString());
        }else{
        st.append("->");
        dfspath(ans,st,root.left);
        dfspath(ans,st,root.right);
        }
        st.setLength(len);
    }
}