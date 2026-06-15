class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0; i<=n; i++){
            result[i]=function(i);
        }
        return result;
    }
}
private int function(int p){
        int count=0;
        while(p!=0){
        if((p&1)==1){
            count++;
            }
            p=p>>1;
        }
        return count;
    }

