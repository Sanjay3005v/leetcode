//145. Binary Tree Postorder Traversal


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
var postorderTraversal = function(root) {
    const list=[];
    if(root===null){
        return list;
    }
    const postorder=(node,arr)=>{
        if(node===null){
            return;
        }
        postorder(node.left,arr);
        postorder(node.right,arr);
        arr.push(node.val);
    };
    postorder(root,list);
    return list;
};
