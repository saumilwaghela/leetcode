class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap <Integer,Integer>hmap = new HashMap<Integer,Integer>();
        HashSet <Integer> mySet = new HashSet<Integer>();
        for(int x:nums){
            int count = hmap.getOrDefault(x,0);
            ++count;
            if(count>(n/3) && !mySet.contains(x)){
                mySet.add(x);
            }
            hmap.put(x,count);
        }
        return new ArrayList<Integer>(mySet);
    }
}