class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices= new HashMap<>();

        for(int i=0; i<nums.length; i++){
            indices.put(nums[i], i);
        }
        for(int i=0; i<nums.length;i++){
            int dif = target-nums[i];
            if(indices.containsKey(dif) && indices.get(dif)!=i){
                return new int[]{i, indices.get(dif)};
            }
        }
        return new int[]{};
    }
}
