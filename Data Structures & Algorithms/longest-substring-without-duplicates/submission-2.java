class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0, result=0;
        int maxLength=0;
        for(int right=0; right<s.length(); right++){
            char current = s.charAt(right);

            if(map.containsKey(current)){
                left=Math.max(map.get(current)+1, left);
            }
            map.put(current, right);
            result=Math.max(result, right-left+1);
        }
        return result;

}
}
