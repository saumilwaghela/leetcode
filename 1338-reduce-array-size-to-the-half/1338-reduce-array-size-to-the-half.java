class Solution {
    public int minSetSize(int[] arr) {
// HashMap<Integer,Integer> map=new HashMap<>();
// 		for(int i=0;i<arr.length;i++){
// 			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
// 		}
// 		int [] freqarr=new int[100001];
// 		for(int key: map.keySet()){
// 			freqarr[map.get(key)]++; 
// 		}
// 		int size=arr.length;int count=0;
// 		for(int i=freqarr.length-1;i>=0 && size>arr.length/2;){ // traverse array in rev order to greedily choose the max frequency
// 			if(freqarr[i]==0){
// 				i--;
// 			}else{ // keep reducing the size till freq[i]==0 -> use up all high freq elements
// 				while(freqarr[i]!=0 && size>arr.length/2){
// 					size-=i;
// 					freqarr[i]--; 
// 					count++;
// 				}
// 				if(size<=arr.length/2) return count;
// 				i--;
// 			}
// 		}
		// return count;
        Map<Integer, Integer> countMap = new HashMap<>();
        PriorityQueue<Integer> countValues = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        for (int value : countMap.values()) countValues.offer(value);

        int size = arr.length; int result = 0;
        while (size > arr.length / 2) {
            size -= countValues.poll();
            result++;
        }

        return result;
    }
}