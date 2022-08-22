class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue <Integer>pq = new PriorityQueue<Integer>((a,b)->b-a);
       for(int x:stones){
           pq.offer(x);
       }
       if(pq.size()==1) return pq.poll();
       while(pq.size() > 1){
           int heaviest = pq.poll();
           int secondHeaviest = pq.poll();
            //System.out.println(heaviest+","+secondHeaviest);
           if(heaviest - secondHeaviest!=0){
               pq.offer(heaviest - secondHeaviest);
           }
       }
       return pq.size()==1?pq.poll():0;
    }
}