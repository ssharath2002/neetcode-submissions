

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] grouped = new boolean[strs.length];

        for(int i=0; i<strs.length; i++){
        if(!grouped[i]){
        List<String> group = new ArrayList<>();
            group.add(strs[i]);
            grouped[i]=true;
        char[] current = strs[i].toCharArray();
        Arrays.sort(current);
        for(int j=i+1; j<strs.length; j++){
            if(!grouped[j]){
                char[] next =strs[j].toCharArray();
                Arrays.sort(next);
                if(Arrays.equals(current,next)){
                group.add(strs[j]);
                grouped[j]=true;
                }
            }
        }
        result.add(group);

    }
}
   return result;
    }
}
        
