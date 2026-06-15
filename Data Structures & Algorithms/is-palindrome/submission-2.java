class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder fi = new StringBuilder();
        for(Character ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                fi.append(ch.toLowerCase(ch));
            }
        }
        String renew = fi.toString();
        String fon = fi.reverse().toString();
        return renew.equals(fon);
    }
}
