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
 * @return {number[]}
 */
var averageOfLevels = function(root) {
    const ans=[];
     if(root==null) return root;

     const queue=[root];
     let left=0;

     while(left<queue.length){
        const size=queue.length-left;
        let tempsum=0;

        for(let i=0;i<size;i++){
            const TreeNode=queue[left++];
            tempsum+=TreeNode.val;

            if(TreeNode.left!=null) queue.push(TreeNode.left);
            if(TreeNode.right!=null) queue.push(TreeNode.right);
        }

        ans.push(tempsum/size);
     }
     return ans;
};