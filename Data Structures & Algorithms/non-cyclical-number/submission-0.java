class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> se= new HashSet<Integer>();
      
        while(n!=1){
            if(se.contains(n)){
                return false;
            }
            se.add(n);
            n=sumofsquares(n);
            if(n==1)
               return true;
        }
        return true;
    }
    private int sumofsquares(int n){
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
            return sum;
        }
    }

