class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=function(piles);
       // System.out.println(right);

        while(left<=right) {
            int mid=(left+right)/2;
            if(function1(piles,h,mid)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }    
        }
         return left;
    }

        private boolean function1(int[] piles, int h ,int k){
            int totaltime=0;
            for(int pile:piles){
                totaltime+=(pile/k);
                if(pile%k != 0 )
                totaltime++;
            }
            //System.out.println(totaltime);
            return totaltime<=h;
        }


        private int function(int[] piles){
            int max=0;
            for(int pile:piles){
                max=Math.max(max,pile);
            }
            return max;
        }
    }



