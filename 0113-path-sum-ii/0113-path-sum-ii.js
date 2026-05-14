/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} targetSum
 * @return {number[][]}
 */


var pathSum = function(root, targetSum) {
    let ans=[];
    let temp=[];

    if(root==null) return ans;

    dfs(ans,temp,root,targetSum);
    return ans;   
};

function dfs(ans,temp,root,targetSum){
    if(root==null) return;

    temp.push(root.val);

    if(root.val==targetSum && root.left==null && root.right==null) {
        ans.push([...temp]); //pushing copy instead refrence of temp
    }else{
    dfs(ans,temp,root.left,targetSum-root.val);
    dfs(ans,temp,root.right,targetSum-root.val);}

    temp.pop();
}