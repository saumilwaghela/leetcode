class Solution {
    int[] dx = {0, -1, 0, 1};
    int[] dy = {-1, 0, 1, 0};
    
    class coordinatesData {
        int x;
        int y;
        int height;
        public coordinatesData(int x, int y, int height){
            this.x=x;
            this.y = y;
            this.height = height;
        }
    }
    
    public void processBoundaries(PriorityQueue<coordinatesData> pq,int[][] heightMap,boolean visited[][]){
        int b = heightMap[0].length;
        int l = heightMap.length;
        for(int i=0;i<heightMap.length;i++){
            pq.offer(new coordinatesData(i,0,heightMap[i][0]) );
            visited[i][0] = true;
            
            pq.offer(new coordinatesData(i,b-1,heightMap[i][b-1]) );
            visited[i][b-1] = true;
        }
        for(int j=0;j<heightMap[0].length;j++){
            pq.offer(new coordinatesData(0,j,heightMap[0][j]) );
            visited[0][j] = true;
            
            pq.offer(new coordinatesData(l-1,j,heightMap[l-1][j]) );
            visited[l-1][j] = true;
        }
    }
    
//     public boolean isSafe(int[][] heightMap, boolean[][] visited, int x, int y){
//         int b = heightMap[0].length;
//         int l = heightMap.length;
        
//         if(x<0||x>l||y<0||y>b) return false;
//         return visited[x][y]==false
//     }
    
    public int trapRainWater(int[][] heightMap) {
        
        if(heightMap == null || heightMap.length==0) return 0;
        
        int m= heightMap.length;
        int n= heightMap[0].length;
        boolean visited[][]=new boolean[m][n];
        
        PriorityQueue<coordinatesData> pq = new PriorityQueue<coordinatesData>((c1,c2)->c1.height-c2.height);
        
        int totalWater= 0;
        
        processBoundaries(pq,heightMap,visited);
        
        coordinatesData cd = null;
        
        int x=0,y=0,height=0;
        
        while(!pq.isEmpty()){
            cd = pq.poll();
            x = cd.x;
            y = cd.y;
            height = cd.height;
            
            for(int k=0;k<4;k++){
                int newX = dx[k]+x;
                int newY = dy[k]+y;
                if( !(newX<0) && !(newY<0) && !(newX>=m) && !(newY>=n) && !visited[newX][newY] ){
                    visited[newX][newY] =true;
                    if(heightMap[newX][newY] < height){
                        totalWater = totalWater + (height - heightMap[newX][newY]);
                        pq.offer(new coordinatesData(newX,newY,height));
                    }
                    else if(heightMap[newX][newY] == height){
                        pq.offer(new coordinatesData(newX,newY,height));
                    }
                    else{
                        pq.offer(new coordinatesData(newX,newY,heightMap[newX][newY]));
                    }
                }
            }
            
        }
        return totalWater;
        
    }
}