class Solution {
    public int maxScore(int[] cardPoints, int k) {
      // Logic: find subarray of length n-k whose sum is minimum and return totalsum- its_sum as answer
      // although we are taking values from start or end but the remaining array becomes a contiguious sub array 
       int n = cardPoints.length, totalSum = 0, minSubArray = 0;
       for(int i=0, currSum = 0 ;i< n ;i++){ // currSum is sum of values in sliding window upto length n-k
           totalSum += cardPoints[i];
           currSum +=  cardPoints[i];
           if(i<n-k) minSubArray += cardPoints[i];
           else{
               currSum -=cardPoints[i-(n-k)];
               minSubArray= Math.min(minSubArray,currSum);
           }
       }
       return totalSum-minSubArray;
    }
}