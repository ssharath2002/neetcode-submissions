class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder fi = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                fi.append(Character.toLowerCase(ch));
            }
        }
            String newfil= fi.toString();
            String revnew= fi.reverse().toString();
            return newfil.equals(revnew);
            
        }
    }

