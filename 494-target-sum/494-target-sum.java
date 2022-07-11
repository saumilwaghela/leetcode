class Solution {
    public int countPossibleWays (int []nums,int currentSum, int target,int index){
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
    public int findTargetSumWays(int[] nums, int target) {
        return countPossibleWays(nums,0,target,0);
    }
}