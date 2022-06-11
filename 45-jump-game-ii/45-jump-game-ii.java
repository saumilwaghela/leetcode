class Solution {
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0; i<nums.length -1; i++){
            for(int j=i;j< i+nums[i] && j<nums.length-1 && dp[i] != Integer.MAX_VALUE ; j++ ){
                dp[j+1]= Math.min(dp[j+1],dp[i]+1);
            }
        }
        return dp[nums.length-1];
    }
}