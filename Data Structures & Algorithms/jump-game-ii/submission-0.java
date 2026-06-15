class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        
        int left=0;
        int right=0;
        int maxReach=0;
        int jumps=0;
        while(right<nums.length-1){
            for(int i=left; i<=right; i++){
                maxReach=Math.max(maxReach, i+nums[i]);
            }
            left=right+1;
            right=maxReach;
            jumps++;
        }
        return jumps;
    }
}
