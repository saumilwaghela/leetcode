class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int stringLength = s.length(); 
        boolean[] dp = new boolean[stringLength + 1];
        dp[0] = true;

        for (int i = 1; i <= stringLength; i++){
            for (int j = 0; j < i; j++){
                if (dp[j] && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                }
            }
        }
        return dp[stringLength];
    }
}