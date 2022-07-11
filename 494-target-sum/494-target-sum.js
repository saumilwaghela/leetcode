/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var findTargetSumWays = function(nums, target) {
    var countPossibleWays = function (nums,currentSum,target,index){
        if(index==nums.length && target== currentSum){
            return 1;
        }
        else if(index==nums.length && target!= currentSum){
            return 0;
        }
        else{
            return countPossibleWays(nums,currentSum+nums[index],target,index+1) + countPossibleWays(nums,currentSum-nums[index],target,index+1);
        }
    }
    
     return countPossibleWays(nums,0,target,0);
};