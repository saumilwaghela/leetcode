/**
 * @param {number[][]} grid
 * @return {number}
 */
var maxArea = 0;
var visited ;
var currentArea = 0;
var findArea = function(grid){
    for(var i=0;i<grid.length;i++){
        for(var j=0;j<grid[0].length;j++){
            if(grid[i][j]===1 && !visited[i][j]){
                currentArea = 0
                checkAdjacentArea(grid,i,j)
                if(currentArea > maxArea) maxArea = currentArea;
            }
        }
        //console.log(i,'--> maxArea=',maxArea)
    }
}
var checkAdjacentArea = function(grid,currentX,currentY){
    //console.log('checking==',currentX,',', currentY,' area=',currentArea)
    if(currentX <= -1 || currentX >= grid.length) return 0;
    if(currentY <= -1 || currentY >= grid[0].length) return 0;
    if(grid[currentX][currentY] === 0|| visited[currentX][currentY]) return 0;
    if( grid[currentX][currentY]===1 && !visited[currentX][currentY]) {
        visited[currentX][currentY] = true;
        ++currentArea;
        return checkAdjacentArea(grid,currentX-1,currentY)
          +checkAdjacentArea(grid,currentX+1,currentY)
          +checkAdjacentArea(grid,currentX,currentY-1)
          +checkAdjacentArea(grid,currentX,currentY+1) 
    }
    return currentArea
}
var maxAreaOfIsland = function(grid) {
    maxArea=0;
    visited = Array(grid.length).fill().map(()=>Array(grid[0].length).fill(false));
    findArea(grid);
    return maxArea;
};