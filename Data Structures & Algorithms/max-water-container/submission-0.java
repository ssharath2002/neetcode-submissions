class Solution {
    public int maxArea(int[] heights) {
        int Maxarea= Integer.MIN_VALUE;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            if(heights[left]>heights[right]){
                int area= (heights[right])*(right-left);
                Maxarea=Math.max(Maxarea,area);
                right--;
            }
            else{
                int area= (heights[left])*(right-left);
                Maxarea=Math.max(Maxarea,area);
                left++;
            }
        }
        return Maxarea;
    }
}
