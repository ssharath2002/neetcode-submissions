class Solution {
    public int characterReplacement(String s, int k) {

        int left=0;
        int maxFreq=0;
        int maxLen=0;

        int[] freq = new int[26];
        
        for(int right=0; right<s.length(); right++){
            Character ch = s.charAt(right);
            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq, freq[ch-'A']);

            int windowLen = right-left+1;

            while(windowLen-maxFreq>k){
                Character pi = s.charAt(left);
                freq[pi-'A']--;
                left++;
                windowLen = right-left+1;
            }
            maxLen = Math.max(maxLen, windowLen);
        }
        return maxLen;
        
}
}
