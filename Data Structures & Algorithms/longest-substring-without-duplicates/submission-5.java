class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left=0;
        int best = 0;
        for(int right=0 ; right<s.length(); right++){
             Character ch = s.charAt(right);
             while(window.contains(ch)){
                window.remove(s.charAt(left));
                left++;
             }
             window.add(ch);
             best = Math.max(best, right-left+1);
        }
        return best;
    }
}
