class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder fi = new StringBuilder();
        for(Character ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                fi.append(ch.toLowerCase(ch));
            }
        }
        String fon = fi.toString();
        String renew= fi.reverse().toString();
        
        return fon.equals(renew);
        
    }
}
