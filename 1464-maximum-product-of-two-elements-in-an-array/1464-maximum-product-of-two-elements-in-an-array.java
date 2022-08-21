class Solution {
    public int maxProduct(int[] nums) {
        Queue <Integer> pq = new PriorityQueue();
        for(int i=0;i<2;i++){
            pq.offer(nums[i]);
        }
        for(int i=2;i<nums.length;i++){
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return (pq.poll()-1)*(pq.poll()-1);
    }
}