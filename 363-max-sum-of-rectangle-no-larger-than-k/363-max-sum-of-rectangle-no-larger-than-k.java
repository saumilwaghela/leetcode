class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n= matrix[0].length;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<m;i++){
            int sum[] = new int[n];
            for(int j=i;j<m;j++){
                for(int x=0;x<n;x++){
                    sum[x] += matrix[j][x];
                }
                int currMax = findMaxSubArray(sum,k);
                maxSum = Math.max(maxSum,currMax);
            }
        }
        return maxSum;
        
    }
    
   public int findMaxSubArray(int a[],int k)
    {
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<a.length;i++)
        {
            int s=0;
            for(int j=i;j<a.length;j++)
            {
                s+=a[j];
                if(s<=k)
                ans=Math.max(ans,s);
            }
        }
        
        return ans;
    }
}