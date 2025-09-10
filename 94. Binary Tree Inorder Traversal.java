//94. Binary Tree Inorder Traversal


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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
       return inorder(root,list);
    }
    public List<Integer> inorder(TreeNode parent, List list) {
		
        
		if (parent.left != null) {
			inorder(parent.left,list);
		}
        list.add(parent.val);
		if (parent.right != null) {
			inorder(parent.right,list);
		}
        return list;
    }
}
