class Solution {
    public void counterHelper(int []nums,int arrayCount, TreeMap <Integer,TreeSet<Integer>> myMap){
        for(int x:nums){
          TreeSet<Integer> ts= myMap.getOrDefault(x,new TreeSet<Integer>());
          ts.add(arrayCount);
          myMap.put(x,ts);
        }
    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int THRESHOLD_VALUE = 2;
        List<Integer> myList = new ArrayList<Integer>();
        TreeMap <Integer,TreeSet<Integer>> myMap1 = new TreeMap<Integer,TreeSet<Integer>>();
        
        counterHelper(nums1,1,myMap1);
        counterHelper(nums2,2,myMap1);
        counterHelper(nums3,3,myMap1);
        
        for(Map.Entry<Integer,TreeSet<Integer>> entry: myMap1.entrySet()){
            if(entry.getValue().size()>=THRESHOLD_VALUE){
                myList.add(entry.getKey());
            }
        }
        
        return myList;
    }
}