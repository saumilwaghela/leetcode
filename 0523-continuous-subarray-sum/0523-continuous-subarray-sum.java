class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sums [] = new int[nums.length+1];
        sums[0]=0;
        for(int i=0;i<nums.length;i++){
            sums[i+1] = sums[i]+nums[i];
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= nums.length; i++) {
            set.add(sums[i - 2] % k);
            if (set.contains(sums[i] % k)) { 
                return true;
            }
        }
        // for(int i=2;i<sums.length;i++){
        //     for(int j=0;j<i-1;j++){
        //         if((sums[i]-sums[j])%k==0) return true;
        //     }
        // }
        return false;
    }
}