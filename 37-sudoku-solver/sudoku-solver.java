class Solution {
    public void solveSudoku(char[][] board) {
        helper(board , 0 , 0 );
    }


    public boolean helper(char[][] board , int row , int col){
        if(row == 9){
            return true  ;
        }

        int nextrow = row ;
        int nextcol = col+1;

        if(col+1 == 9){
            nextrow = row+1 ;
            nextcol = 0;
        }


        if(board[row][col] !='.'){
           return  helper(board , nextrow , nextcol);
        }

        for(char digit = '1' ; digit <='9' ; digit++){

                if(isSafe(board , row , col , digit)){
                    board[row][col] = digit;
                    if(helper(board , nextrow  , nextcol)){
                        return true ;
                    }
                    board[row][col] = '.';
                }
        }

        return false  ;


        
    }


    public boolean isSafe(char sudoku[][] , int row , int col , char digit){

    // vertical
    for (int i = 0; i< 9; i++){
        if(sudoku[i][col] == digit){
            return false;
        }
    }

    // horizontal
    for (int i = 0; i < 9; i++){
        if(sudoku[row][i]== digit){
            return false; 
        }
    }

    // grid
    int startrow = (row / 3) * 3;
    int startcol = (col / 3) * 3;

    for (int i = startrow; i < startrow + 3; i++){
        for (int j = startcol; j < startcol + 3; j++){
            if(sudoku[i][j] == digit){
                return false; 
            }
        }
    }

    return true;
}
}