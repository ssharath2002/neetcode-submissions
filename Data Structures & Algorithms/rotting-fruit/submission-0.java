class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> queue= new LinkedList<>();
        int freshcount=0;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(grid[r][c]==2){
                    queue.offer(new int[]{r,c});
                }
                else if(grid[r][c]==1){
                    freshcount++;
                }
            }
        }
        if(freshcount==0){
            return 0;
        }
        int min=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            boolean root=false;
            for(int i=0; i<size; i++){
                int[] rotten =queue.poll();
                int r= rotten[0];
                int c= rotten[1];

                for(int[] dir:directions){
                    int newRow=r+dir[0];
                    int newCol=c+dir[1];
                    if(newRow>=0 && newRow<rows && newCol>=0 && newCol<cols && grid[newRow][newCol]==1){
                        grid[newRow][newCol]=2;
                        queue.offer(new int[]{newRow, newCol});
                        freshcount--;
                        root=true;
                    }
                }
            }
            if(root){
                min++;
            }
        }
        return freshcount==0?min:-1;
    }
}
