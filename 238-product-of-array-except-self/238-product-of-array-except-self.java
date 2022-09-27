class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l_prod=1,r_prod=1,len=nums.length;
        int res[]=new int[len];
        for (int i=0;i<len;i++){
            res[i]=l_prod;
            l_prod*=nums[i];
        }
        for (int i=len-1;i>=0;i--){
            res[i]*=r_prod;
            r_prod*=nums[i];
        }
        return res;
    }
}