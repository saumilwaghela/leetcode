class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> mySet = new TreeSet<Integer>();
        TreeMap <Integer,TreeSet<Integer>> myMap1 = new TreeMap<Integer,TreeSet<Integer>>();
        
        for(int x:nums1){
          TreeSet<Integer> ts= myMap1.getOrDefault(x,new TreeSet<Integer>());
          ts.add(1);
          myMap1.put(x,ts);
        }
        
        for(int x:nums2){
          TreeSet<Integer> ts= myMap1.getOrDefault(x,new TreeSet<Integer>());
          ts.add(2);
          myMap1.put(x,ts);
        }
        
        for(int x:nums3){
          TreeSet<Integer> ts= myMap1.getOrDefault(x,new TreeSet<Integer>());
          ts.add(3);
          myMap1.put(x,ts);
        }
        
        for(Map.Entry<Integer,TreeSet<Integer>> entry: myMap1.entrySet()){
            if(entry.getValue().size()>=2){
                mySet.add(entry.getKey());
            }
        }
        
        return new ArrayList<Integer>(mySet);
    }
}