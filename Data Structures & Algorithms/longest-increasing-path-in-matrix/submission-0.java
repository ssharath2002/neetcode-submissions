class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return 0;
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] visited = new int[rows][cols];
        int maxlength=0;
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols; j++){
                maxlength= Math.max(maxlength, dfs(matrix,i,j,visited));
            }
        }
        return maxlength;
    }
    public int dfs(int[][] matrix, int i, int j, int[][] visited){
        if(visited[i][j]!=0){
            return visited[i][j];
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        int maxlength=1;
        for(int[] dir:directions){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0 && x<rows && y>=0 && y<cols && matrix[x][y]>matrix[i][j]){
                 maxlength=Math.max(maxlength, 1+dfs(matrix,x,y,visited));
            }
        }
        visited[i][j]=maxlength;
        return maxlength;
      }
}

