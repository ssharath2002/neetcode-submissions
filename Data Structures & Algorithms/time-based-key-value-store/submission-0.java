class TimeMap {

     private Map<String, List<TimeValuePair>>store;

     private class TimeValuePair{
        int timestamp;
        String value;

        TimeValuePair(int timestamp, String value){
        this.timestamp=timestamp;
        this.value=value;
     }
     }

    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.putIfAbsent(key, new ArrayList<>());
        store.get(key).add(new TimeValuePair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {

        if(!store.containsKey(key)){
            return "";
        }
        List<TimeValuePair> values=store.get(key);

        int left=0;
        int right=values.size()-1;
        while(left<=right){
        int mid=(left+right)/2;
        if(values.get(mid).timestamp==timestamp){
            return values.get(mid).value;
        }
        else if(values.get(mid).timestamp>timestamp){
            right=mid-1;
        }
        else{
            left=mid+1;
        }
    }
    return right>=0?values.get(right).value:"";
 }
}


