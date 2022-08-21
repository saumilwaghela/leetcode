class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        HashSet <Integer>mySet = new HashSet<Integer>();
        for(int x:nums){
            if(!mySet.contains(x) && x!=0){
                mySet.add(x);
                ++res;
            }
        }
        return res;
    }
}