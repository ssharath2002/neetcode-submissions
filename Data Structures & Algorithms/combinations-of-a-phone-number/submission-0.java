class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.isEmpty()){
            return new ArrayList<>();
        }
        String[] map={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",
        };
        List<String> result = new ArrayList<>();
        backtrack(result,digits,map,new StringBuilder(), 0);
        return result;
    }
    private void backtrack(List<String>result, String digits, String[] map, StringBuilder current, int index){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
      String letters= map[digits.charAt(index)-'0'];
        for(char letter : letters.toCharArray()){
            current.append(letter);
            backtrack(result,digits,map,current,index+1);
            current.deleteCharAt(current.length()-1);
        }
    }
}
