class Solution {
    public boolean isValidSudoku(char[][] board) {
          HashSet<Character>[]row = new HashSet[9];
          HashSet<Character>[]cols = new HashSet[9];
          HashSet<Character>[]boards = new HashSet[9];
          for(int i=0 ; i<board.length; i++){
            row[i]= new HashSet<>();
            cols[i]= new HashSet<>();
            boards[i]=new HashSet<>();
          }
          for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char nums=board[i][j];
                if(nums =='.'){
                   continue;
                }
                int boardIndex = (i/3)*3+j/3;
                if(row[i].contains(nums) || cols[j].contains(nums) || boards[boardIndex].contains(nums)){
                    return false;
                }
                row[i].add(nums);
                cols[j].add(nums);
                boards[boardIndex].add(nums);
            }
          }
          return true;
    }
}
