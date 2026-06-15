class Solution {
    public boolean isAnagram(String s, String t) {
           if(s.length()!=t.length()){
                return false;
           }
           char[] mi = s.toCharArray();
           char[] zo = t.toCharArray();
            Arrays.sort(mi);
            Arrays.sort(zo);
            return Arrays.equals(mi,zo);    
    }
}

