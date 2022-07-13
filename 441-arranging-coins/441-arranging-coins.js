/**
 * @param {number} n
 * @return {number}
 */
var arrangeCoins = function(n) {
    if(n==1) return 1;
    var remainingCoin = n;
    var i =1;
    for(i=1;i<n && remainingCoin >=i; i++){
        remainingCoin-=i;
    }
    return i-1
    
};