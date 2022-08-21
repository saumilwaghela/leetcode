class Solution {
    class IndexStrengthStore implements Comparable{
        int index;
        int strength;
        public IndexStrengthStore(int index,int strength){
            this.index= index;
            this.strength = strength;
        }
        
        public int compareTo(Object obj){
            IndexStrengthStore iss = (IndexStrengthStore) obj;
            if(strength<iss.strength) return 1;
            if(strength>iss.strength) return -1;
            if(index<iss.index) return 1;
            if(index>iss.index) return -1;
            return 0;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        Queue <IndexStrengthStore> pq = new PriorityQueue<IndexStrengthStore>();
        int currentIndex = 0;
        for(int arr[]:mat){
            int currentStrength =0;
            for(int x:arr){
                currentStrength+=x;
            }
            IndexStrengthStore issObj = new IndexStrengthStore(currentIndex,currentStrength);
            if(currentIndex++<k){
                pq.offer(issObj);
            }else{
                IndexStrengthStore topElement = pq.peek();
                if(topElement.compareTo(issObj) < 0){
                    pq.poll();
                    pq.add(issObj);
                }
            }
            //++currentIndex;
        }
        int[] result = new int[k];
        for(int i=0; i<k; i++)
        {
            result[k-i-1] = pq.poll().index;
        }
        return result;
    }
}