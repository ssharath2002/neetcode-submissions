class Solution {
    public int characterReplacement(String s, int k) {
         int[] count = new int[26];
         int maxcount=0;
         int left=0;
         int maxlength=0;
         for(int right=0; right<s.length(); right++){
            maxcount=Math.max(maxcount, ++count[s.charAt(right)-'A']);
            while(right-left+1-maxcount>k){
                --count[s.charAt(left)-'A'];
                left++;
            }
            maxlength=Math.max(maxlength, right-left+1);
         }
         return maxlength;
    }
}
