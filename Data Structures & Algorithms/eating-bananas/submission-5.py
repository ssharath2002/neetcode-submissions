class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left = 1
        right = max(piles)

        result = right

        while left<=right:
            mid = (left+right)//2

            if self.canfinish(piles , mid, h):
                result = mid
                right = mid-1
            else:
                left = mid+1

        return result

    def canfinish(self, piles: List[int], k:int , h:int) -> bool:
        hours = 0
        for pile in piles:
            hours += (pile+k-1)//k
            if hours>h:
                return False
        return True


        