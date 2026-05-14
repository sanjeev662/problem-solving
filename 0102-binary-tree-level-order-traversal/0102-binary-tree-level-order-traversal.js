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
 * @return {number[][]}
 */
var levelOrder = function(root) {
    const ans=[];
    if(root==null) return ans;

    const queue=[root];
    
    while(queue.length>0){
        const size=queue.length;
        const level=[];

        for(let i=0;i<size;i++){
            const TreeNode=queue.shift();

            level.push(TreeNode.val);
            if(TreeNode.left!=null) queue.push(TreeNode.left);
            if(TreeNode.right!=null) queue.push(TreeNode.right);
        }
        ans.push(level);  
    }
    return ans;
};