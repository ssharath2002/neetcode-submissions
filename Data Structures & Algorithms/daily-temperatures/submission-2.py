class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        result = [0]*n
        stk = []

        for i in range(n):
            while stk and temperatures[i]>temperatures[stk[-1]]:
                prevIndex = stk.pop()
                result[prevIndex]=i-prevIndex
            stk.append(i)
        return result
        
        