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
    public boolean answer = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        check(p,q);
        return answer;
       
    }
    public void check(TreeNode p, TreeNode q){
        if(answer){
            if(p!=null && q!=null && p.val!=q.val) {
                answer = false;
            }
            if(p!=null && q!=null && p.val==q.val){
                check(p.left,q.left);
                check(p.right,q.right);
            }
            if(p==null & q!=null) {
                answer = false;
            };
            if(p!=null & q==null) {
                answer= false;
            }
        }
    }
}