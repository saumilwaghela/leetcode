/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List <List<Integer>> myList = new ArrayList <List<Integer>>();
        if(root == null) return myList;
        
        Queue <Node> queue = new ArrayDeque<Node>();
        queue.offer(root);
    
        while(!queue.isEmpty()){
            int currentLevelSize = queue.size();
            List<Integer> currentLevelList = new ArrayList<Integer>();
            
            while(currentLevelSize!=0){
                Node n = queue.poll();
                currentLevelList.add(n.val);
                if(n.children != null){
                    for(Node x: n.children){
                        queue.offer(x);
                    }
                }
                --currentLevelSize;
            }
            
            myList.add(currentLevelList);
        }
        
        return myList;
    }
}