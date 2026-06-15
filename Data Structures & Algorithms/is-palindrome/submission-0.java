class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filter = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                filter.append(Character.toLowerCase(ch));
            }
        }
        String newfilter = filter.toString();
        String reversefilter = filter.reverse().toString();
        return newfilter.equals(reversefilter);
    }
}
