class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> myMap = new TreeMap<Integer,Integer>();
        int largestNumber = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && !myMap.containsKey(nums[i])){
                myMap.put(nums[i],1);
                if(nums[i]>largestNumber){
                    largestNumber = nums[i];
                }
            }
        }
        int j;
        for(j=1; j<=largestNumber;j++){
            if(!myMap.containsKey(j)){
                break;
            }
        }
        return j;
    }
}