class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>result= new ArrayList<>();
        backtrack(result, nums, target, 0, new ArrayList<>());
        return result;
    }
    private void backtrack(List<List<Integer>> result, int[] nums , int remain, int start, List<Integer> tempList){
             if(remain<0){
                return;
             }
             else if(remain==0){
                result.add(new ArrayList<>(tempList));
             }
             else{
             for(int i=start; i<nums.length; i++){
             tempList.add(nums[i]);
             backtrack(result,nums,remain-nums[i], i, tempList);
             tempList.remove(tempList.size()-1);
            }
        }
    }
}
