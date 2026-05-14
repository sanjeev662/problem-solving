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
    let front=0;
    
    while(front<queue.length){
        const size=queue.length-front;
        const level=[];

        for(let i=0;i<size;i++){
            const TreeNode=queue[front++];

            level.push(TreeNode.val);
            if(TreeNode.left!=null) queue.push(TreeNode.left);
            if(TreeNode.right!=null) queue.push(TreeNode.right);
        }
        ans.push(level);  
    }
    return ans;
};