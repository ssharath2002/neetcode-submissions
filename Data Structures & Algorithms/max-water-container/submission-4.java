class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int best = 0;

        while(left<right){
            int h = Math.min(heights[left], heights[right]);
            int width = right - left;
            int currentArea = width*h;
            best = Math.max(currentArea, best);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return best;
              
    }
}
