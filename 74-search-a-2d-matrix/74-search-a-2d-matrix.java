class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length;
       int n=matrix[0].length;
       int i,j;
       for(i=0;i<m-1;i++){
          if(matrix[i][0] <=target && target<=matrix[i][n-1]) break;
        }
        if(i==m) return false;
        for(j=0;j<n;j++){
            if(matrix[i][j]==target) return true;
        }
        return false;
  }
}