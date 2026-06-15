class Solution {
    public int missingNumber(int[] nums) {
        int k=nums.length;
        int sum=k*(k+1)/2;
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        return sum-totalsum;
    }
}
