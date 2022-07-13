/**
 * @param {string} s
 * @return {string[]}
 */
var solutionSet = []
var checkValidityOfIP = function(ipArray){
    if(ipArray.length !=4) return false;
    for(var x=0;x<ipArray.length;x++){
        if(ipArray[x].startsWith('0') && ipArray[x].length !=1) return false;
        if(parseInt(ipArray[x])>255) return false;
    }
    return true;
}
var createCombination = function(str,dots,ipArray =[]){
    //console.log(str,'--',dots,'--',ipArray)
    if(ipArray.length == 4 && dots == 0 && str.length ==0 && checkValidityOfIP(ipArray)){
        solutionSet.push(ipArray.join('.'))
        return;
    }
    if(ipArray.length == 4 && dots == 0 && str.length !=0){
        return;
    }
    if(dots ==0) return;
    for(var i=1;i<=3 && i<=str.length;i++){
        createCombination(str.slice(i),dots-1,[...ipArray,str.slice(0,i)])
        if(i==1 && str.slice(0,i)=='0') break;
    }
    
}
var restoreIpAddresses = function(s) {
    solutionSet = []
    if(s.length <=3 || s.length > 12) return solutionSet
    createCombination(s,4)
    return solutionSet
};