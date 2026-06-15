class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        if not matrix or not matrix[0]:
            return false
       
        m = len(matrix)
        n = len(matrix[0])
        left = 0
        right = m*n-1

        while left<=right:
            mid = (left+right)//2
            midelement = matrix[mid//n][mid%n]
            if midelement>target:
                right = mid-1
            elif midelement < target:
                left = mid+1
            else:
                return True
        
        return False


        