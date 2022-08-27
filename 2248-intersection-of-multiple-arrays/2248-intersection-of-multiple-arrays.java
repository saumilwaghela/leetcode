class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap <Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                hmap.put(nums[i][j], hmap.getOrDefault(nums[i][j],0)+1);
            }
        }
        List <Integer> list = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            if(entry.getValue()==nums.length){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}