class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mc = new HashMap<>();
        int left=0;
        int maxlength=0;
        for(int right=0; right<s.length(); right++){
            char result =s.charAt(right);
            if(mc.containsKey(result)){
                left= Math.max(left, mc.get(result)+1);
            }
            mc.put(result, right);
            maxlength= Math.max(maxlength, right-left+1);
        }
        return maxlength;
    }
}
