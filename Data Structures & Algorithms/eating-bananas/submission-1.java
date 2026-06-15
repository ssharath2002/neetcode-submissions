class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;

        for(int pile: piles){
            right = Math.max(right, pile);
        }

        int result = right;
        while(left <= right){
            int mid = (left + right)/2;
            if(function(piles, mid, h)){
                result=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
      return result;
    }

    public boolean function(int[] piles, int k, int h ){
        int hours=0;
        for(int pile: piles){
            hours+=(pile+k-1)/k;
        }
        return hours<=h;
    }
}

