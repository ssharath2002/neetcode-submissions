class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][];

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]>merged= new ArrayList<>();

        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for(int[] interval : intervals){
            int currentstart = currentInterval[0];
            int currentend = currentInterval[1];
            int nexstart = interval[0];
            int nexend = interval[1];

            if(currentend>=nexstart){
                currentInterval[1] = Math.max(currentend , nexend);
            }else{
                currentInterval=interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
