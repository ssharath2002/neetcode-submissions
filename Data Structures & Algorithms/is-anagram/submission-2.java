class Solution {
    public boolean isAnagram(String s, String t) {
             if(s.length()!=t.length()){
                return false;
             }
             char[] mo =s.toCharArray();
             char[] to = t.toCharArray();
             Arrays.sort(mo);
             Arrays.sort(to);
             return Arrays.equals(mo, to);
    }
}
