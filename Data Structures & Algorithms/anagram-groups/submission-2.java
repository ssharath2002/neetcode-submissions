class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> grup = new HashMap<>();

        for( String word: strs){
            char[] chr = word.toCharArray();
            Arrays.sort(chr);
            String key = new String(chr);

            if(!grup.containsKey(key)){
                grup.put(key, new ArrayList<>());
            }
          grup.get(key).add(word);
        }
        return new ArrayList<>(grup.values());
    }
}
