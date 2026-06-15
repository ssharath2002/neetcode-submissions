class Solution {
    public int largestRectangleArea(int[] heights) {
          int k = heights.length;
          Stack<Integer> stk = new Stack<>();
          int maxArea = 0;

          for(int i=0; i<=k; i++){
            int currentHeight = (i==k)? 0: heights[i];

          while(!stk.isEmpty() && currentHeight<heights[stk.peek()]){
                int height = heights[stk.pop()];
                int width =  stk.isEmpty()? i : i-stk.peek()-1;
                int currentArea = height*width;
                maxArea = Math.max(maxArea, currentArea);
          }
          stk.push(i);
          }
          return maxArea;
}
}
