class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix[0].length == 0 || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m*n-1;

        while(left<=right){
            int mid = (left+right)/2;

            int midelement = matrix[mid/n][mid%n];

            if(midelement>target){
                right = mid-1;
            }
            else if(midelement<target){
                left = mid+1;
            }
            else{
                return true;
            }
            
        }
        return false;
        
    }
}
