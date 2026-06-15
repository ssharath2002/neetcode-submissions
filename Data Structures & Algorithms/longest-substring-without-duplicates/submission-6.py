class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        window = set()
        left=0
        best=0

        for right in range(len(s)):
            ch = s[right]
            while ch in window:
                window.remove(s[left])
                left+=1
            window.add(ch)
            best = max(best, right-left+1)
        
        return best

        