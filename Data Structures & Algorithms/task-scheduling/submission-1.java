class Solution {
    public int leastInterval(char[] tasks, int n) {
          if(n==0) return tasks.length;

          int[] freq = new int[26];
          for(int z : tasks) freq[z-'A']++;

          int maxFreq=0;
          for(int f : freq){
            if(f>maxFreq) maxFreq=f;
          }
          int maxKind=0;
          for(int f : freq){
            if(f==maxFreq){
                maxKind++;
            }
          }
          int frame = (maxFreq-1)*(n+1)+maxKind;
          return Math.max(tasks.length,frame);
    }
}
