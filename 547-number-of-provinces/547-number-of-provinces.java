class Solution {
    public void dfs(int [][]isConnected, boolean visited[],int currentNode){
        visited[currentNode] = true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[currentNode][j]==1 && !visited[j]){
                dfs(isConnected,visited,j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] = new boolean[isConnected.length];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                ++count;
            }
        }
        return count;
    }
}