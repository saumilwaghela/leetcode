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
    public boolean inOrderTraversal(TreeNode node){
        if(node==null) return false;
        
        boolean leftValue = inOrderTraversal(node.left);
        boolean rightValue = inOrderTraversal(node.right);
        
        if(!leftValue) node.left = null;
        if(!rightValue) node.right = null;
        
        return node.val == 1 || leftValue || rightValue;
    }
    
    public TreeNode pruneTree(TreeNode root) {
        return inOrderTraversal(root) ? root:null;
    }
}