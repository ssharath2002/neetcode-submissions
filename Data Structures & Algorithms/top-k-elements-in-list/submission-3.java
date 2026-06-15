class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]>minHeap = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        for(Map.Entry<Integer, Integer> hp : freq.entrySet()){
            int key = hp.getKey();
            int count = hp.getValue();

            minHeap.offer(new int[]{key, count});
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i++]=minHeap.poll()[0];
        }
        return result;
    }
}
