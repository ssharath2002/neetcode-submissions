class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left=0
        right=len(heights)-1
        best=0
        
        while left<right:
            h = min(heights[left], heights[right])
            width = right - left
            currentArea = h*width
            best = max(currentArea, best)

            if(heights[left]<heights[right]):
                left+=1
            else:
                right-=1
        return best

        