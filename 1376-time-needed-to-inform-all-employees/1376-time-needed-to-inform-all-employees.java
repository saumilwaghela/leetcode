class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
        HashMap <Integer,List<Integer>> employeeMap = new HashMap<Integer,List<Integer>>();
        for(int i=0;i<n;i++){
            if(manager[i]==-1) continue;
            if(!employeeMap.containsKey(manager[i])){
                employeeMap.put(manager[i],new ArrayList<Integer>());
            }
            employeeMap.get(manager[i]).add(i);
        }
        
        Queue <Pair<Integer,Integer>> queue =new ArrayDeque<Pair<Integer,Integer>>();
        
        queue.add(new Pair<Integer,Integer>(headID,0));
        int maxTime = 0;
        
        while(!queue.isEmpty()){
            int stepSize = queue.size();
            while(stepSize!=0){
                Pair<Integer,Integer> pair = queue.poll();
                int currentManager = pair.getKey();
                int currentTime = pair.getValue();
                maxTime= Math.max(maxTime,currentTime);
                
                if(employeeMap.containsKey(currentManager)){
                 List<Integer> subList = employeeMap.get(currentManager);
                 for(int j=0;j<subList.size();j++){
                     queue.add(new Pair<Integer,Integer>(subList.get(j),currentTime+informTime[currentManager]));
                 }   
                }
                --stepSize;
            }
        }
        
        return maxTime;
    }
}