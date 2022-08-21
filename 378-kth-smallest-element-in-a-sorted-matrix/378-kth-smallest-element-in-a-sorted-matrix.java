class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> b - a); //reverse order
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(pq.size() < k){
                    pq.offer(matrix[i][j]);
                }
                else if(matrix[i][j] < pq.peek()){
                    pq.poll();
                    pq.offer(matrix[i][j]);
                }
            }
        }
        return pq.peek();
    }
}