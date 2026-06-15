class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String str : strs ){
           result.append(str.length()).append("#").append(str);
        }
        return result.toString();
    }

    public List<String> decode(String result) {
        List<String>decodeString= new ArrayList<>();
        int i=0;
        while(i<result.length()){
        int correctIndex = result.indexOf('#', i);
        int length = Integer.parseInt(result.substring(i, correctIndex));
        decodeString.add(result.substring(correctIndex+1, correctIndex+1+length));
        i=correctIndex+1+length;
        }
        return decodeString;
    }
}
