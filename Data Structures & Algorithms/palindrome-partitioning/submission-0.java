class Solution {
    public List<List<String>> partition(String s) {
          List<List<String>>result= new ArrayList<>();
          backtrack(s,0,new ArrayList<>(), result);
          return result;
    }
    private void backtrack(String s, int start, List<String> currentString, List<List<String>> result){
           if(start==s.length()){
                result.add(new ArrayList<>(currentString));
           }
           for(int end=start; end<s.length(); end++){
              if(palindrome(s,start,end)){
                   currentString.add(s.substring(start,end+1));
                   backtrack(s,end+1,currentString,result);
                   currentString.remove(currentString.size()-1);
              }
           }
    }
    private boolean palindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
