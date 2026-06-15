class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> curr=new HashSet<>();
        for(int i=0; i<nums.length;i++){
        curr.add(nums[i]);
        }

        int longestlength=0;
        for(int num: curr){
            if(!curr.contains(num-1)){
               int currentNum=num;
               int currentlength=0;
               while(curr.contains(currentNum+1)){
                  currentNum++;
                  currentlength++;
                  longestlength=Math.max(longestlength,currentlength);
               }
            }
        }
        return longestlength+1;
    }
}
