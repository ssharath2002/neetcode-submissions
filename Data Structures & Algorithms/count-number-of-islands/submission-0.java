class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int numOfIslands=0;
        int ROWS=grid.length;
        int COLS=grid[0].length;
        for(int i=0 ; i<ROWS; i++){
            for(int j=0; j<COLS; j++){
                 if(grid[i][j]=='1'){
                    numOfIslands++;
                    dfs(grid,i,j);
                }
            }
        }
        return numOfIslands;
    }
    private void dfs(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';

        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
    }
}
