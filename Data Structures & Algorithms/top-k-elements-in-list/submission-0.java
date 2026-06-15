class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> zo = new HashMap<>();
        for(int num : nums){
            zo.put (num, zo.getOrDefault(num,0)+1);
        } 
        PriorityQueue<Map.Entry<Integer,Integer>> maxheap = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        maxheap.addAll(zo.entrySet());

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i]= maxheap.poll().getKey();
        }
        return result;
}
}
