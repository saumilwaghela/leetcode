class Solution {
    public int maxSumDiv(int []nums, int t){
        int [][]dp = new int[nums.length+1][t];
        dp[0][1] = dp[0][2] = Integer.MIN_VALUE / 2;
        
         for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < t; j++) {
                // 1. not use
                int notUse = dp[i - 1][j];
                
                // 2. use
                int use = nums[i - 1] + dp[i-1][(t + j - nums[i - 1] % t) % t];
                
                dp[i][j] = Math.max(notUse, use);
            }
        }
        
        return dp[nums.length][0];
        
    }
    public int maxSumDivThree(int[] nums) {
        return maxSumDiv(nums,3);
    }
}