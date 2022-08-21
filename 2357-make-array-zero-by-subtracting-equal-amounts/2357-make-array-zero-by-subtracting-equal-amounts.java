class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]!=0)
                queue.add(nums[i]);
        }

        while (!queue.isEmpty()){
            int q = queue.poll();
            while(!queue.isEmpty() && queue.peek() == q) {
                queue.poll();
            }
            res++;
        }
        return res;
    }
}