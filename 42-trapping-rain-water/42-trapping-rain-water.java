class Solution {
    public int trap(int[] height) {
        int leftmax =0, rightmax = 0, l=0 ,r=height.length-1;
        int current = 0, total=0;
        while(l<=r){
           if(leftmax<height[l]) leftmax = height[l];
           if(rightmax<height[r]) rightmax = height[r];
           if(leftmax<rightmax){
               current = leftmax - height[l];
               l++;
           } else{
                current = rightmax - height[r];
                r--;
            }
            if(current >0) total+=current;
        }
        return total;
    }
}