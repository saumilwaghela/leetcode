class Solution {
    public String frequencySort(String s) {
        TreeMap <String,Integer> mapz = new TreeMap<String,Integer>();
        for(int i=0;i<s.length();i++){
            mapz.put(s.substring(i,i+1), mapz.getOrDefault(s.substring(i,i+1),0)+1 ); 
        }
        PriorityQueue <Pair<String,Integer>>pq=new PriorityQueue<Pair<String,Integer>>(new Comparator<Pair<String,Integer>>(){
            public int compare(Pair<String,Integer> a, Pair<String,Integer> b){
                if(b.getValue()-a.getValue() > 0) return 1;
                if(b.getValue()-a.getValue() < 0) return -1;
                if(b.getKey().charAt(0)-a.getKey().charAt(0) > 0) return -1;
                if(b.getKey().charAt(0)-a.getKey().charAt(0) < 0) return 1;
                return 0;
            }
        });
        for(Map.Entry<String,Integer> entry:mapz.entrySet()){
            Pair <String,Integer>p = new <String,Integer> Pair(entry.getKey(),entry.getValue());
            pq.offer(p);
        }
        StringBuffer strbuff = new StringBuffer();
        while(!pq.isEmpty()){
            Pair<String,Integer> pz = pq.poll();
            for(int i=0;i<pz.getValue();i++){
                strbuff.append(pz.getKey());
            }
        }
        return strbuff.toString();
    }
}