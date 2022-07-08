class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int previous = nums[1]-nums[0];
        int count = previous!=0?2:1;
        for(int i=2;i<nums.length;i++){
           int current = nums[i]-nums[i-1];
           if( (current>0 && previous <=0)||(current <0 && previous >=0) ){
               count++;
               previous = current;
           }
        }
        return count;
    }
}