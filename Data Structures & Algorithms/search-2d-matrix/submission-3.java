class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix[0].length==0 || matrix.length==0) return false;
        int rows = matrix.length;
        int cols= matrix[0].length;
        int left=0;
        int right=rows*cols-1;

        while(left<=right){
            int mid = (left + right)/2;
            int midValue = matrix[mid/cols][mid%cols];

            if(target == midValue){
                return true;
            } else if(target<midValue){
                 right=mid-1;
            } else {
                 left=mid+1;
            }
        }
        return false;
}
}

