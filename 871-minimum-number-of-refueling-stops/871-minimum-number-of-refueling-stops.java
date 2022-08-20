class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n=stations.length;
        PriorityQueue <int[]>pq = new PriorityQueue<>((a,b)->(b[1]-a[1]));
        int refill =0;
        int i=0;
        int distance =startFuel;
        
        while(distance < target){
            while(i<n && stations[i][0]<=distance){
                pq.offer(stations[i]);
                ++i;
            }
            if(pq.isEmpty()) return -1;
            distance = distance+pq.poll()[1];
            ++refill;
        }
        return refill;
        // int N = stations.length;
        // long[] dp = new long[N + 1];
        // dp[0] = startFuel;
        // for (int i = 0; i < N; ++i){
        //     for (int t = i; t >= 0; --t){
        //         //System.out.println("i="+i+" t="+t+"--"+Arrays.toString(dp));
        //         if (dp[t] >= stations[i][0])
        //             dp[t+1] = Math.max(dp[t+1], dp[t] + (long) stations[i][1]);
        //     }
        // }
        // for (int i = 0; i <= N; ++i)
        //     if (dp[i] >= target) return i;
        // return -1;
    }
}