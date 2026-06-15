class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>minh= new PriorityQueue<>(k);
        for(int num:nums){
            minh.offer(num);
            if(minh.size()>k){
                minh.poll();
            }
        }
        return minh.peek();
    }
}
