class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>maxheap=new PriorityQueue<>((a,b)->(b-a));
        for(int stone:stones){
            maxheap.offer(stone);
        }
        while(maxheap.size()>1){
            int stone1=maxheap.poll();
            int stone2=maxheap.poll();
            if(stone1!=stone2){
                maxheap.offer(stone1-stone2);
            }
        }
        return maxheap.isEmpty()? 0 : maxheap.peek();
    }
}
