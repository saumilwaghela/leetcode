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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List <List<Integer>> myList = new ArrayList <List<Integer>>();
        if(root == null) return myList;
        
        Queue <TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
    
        while(!queue.isEmpty()){
            int currentLevelSize = queue.size();
            List<Integer> currentLevelList = new ArrayList<Integer>();
            
            while(currentLevelSize!=0){
                TreeNode n = queue.poll();
                currentLevelList.add(n.val);
                if(n.left != null) queue.offer(n.left);
                if(n.right != null) queue.offer(n.right);
                --currentLevelSize;
            }
            
            myList.add(0,currentLevelList);
        }
        
        return myList;
    }
}