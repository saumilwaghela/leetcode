class Solution {
    public int findLongestChain(int[][] pairs) {
      Arrays.sort(pairs, (arr1,arr2)-> arr1[1]-arr2[1]);
      int previousValue = Integer.MIN_VALUE;
      int count=0;
      for(int []pair:pairs){
          if(previousValue < pair[0]){
              count++;
              previousValue = pair[1];
          }
      }
        
      return count;
    }
}