class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap <Integer,Integer> hmap= new HashMap<Integer,Integer>();
        for(int x:arr){
            hmap.put(x, hmap.getOrDefault(x,0)+1);
        }
        HashSet <Integer> hset = new HashSet<Integer>();
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()){
            if(hset.contains(entry.getValue())) return false;
            hset.add(entry.getValue());
        }
        return true;
    }
}