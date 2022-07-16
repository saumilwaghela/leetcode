/**
 * @param {number} m
 * @param {number} n
 * @param {number} maxMove
 * @param {number} startRow
 * @param {number} startColumn
 * @return {number}
 */
var MOD = 1_000_000_007
var moveBall = function(m,n,move,currentX,currentY, memo ={}){
    //console.log(m,'--',n,'--',move,'--',currentX,'--',currentY)
    if(move < 0) return 0;
    if(currentX < 0 || currentX ==m || currentY < 0 || currentY ==n) return 1;
    if(currentX+','+currentY+','+move in memo) return memo[currentX+','+currentY+','+move]
    memo[currentX+','+currentY+','+move]  = (moveBall(m,n,move-1,currentX-1,currentY,memo) % MOD
                                            +moveBall(m,n,move-1,currentX+1,currentY,memo) % MOD
                                            +moveBall(m,n,move-1,currentX,currentY-1,memo) % MOD
                                            +moveBall(m,n,move-1,currentX,currentY+1,memo) % MOD)%MOD
    return memo[currentX+','+currentY+','+move]
    
}
var findPaths = function(m, n, maxMove, startRow, startColumn) {
    return moveBall(m,n,maxMove,startRow,startColumn)
};