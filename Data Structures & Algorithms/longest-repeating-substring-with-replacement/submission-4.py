class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left=0
        maxLen = 0
        maxfreq=0

        freq = [0]*26

        for right in range(len(s)):
            idx = ord(s[right]) - ord('A')
            freq[idx]+=1
            maxfreq = max(maxfreq, freq[idx])

            windowLen = right-left+1

            while(windowLen-maxfreq>k):
                leftchar = ord(s[left])-ord('A')
                freq[leftchar]-=1
                left+=1
                windowLen = right-left+1
            
            maxLen = max(maxLen, windowLen)
            
        return maxLen
        