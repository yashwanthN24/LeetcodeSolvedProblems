class Solution {
    public int totalNQueens(int n) {
        char board[][] = new char[n][n];
        return helper(board , 0);
        
    }

    public int helper(char board[][]  , int row){

        if(row == board.length){
            
            return 1;
        }

        int count = 0 ;
        for(int j = 0 ; j< board.length ; j++){
            if(isSafe(board , row , j)){
                 board[row][j] ='Q';
                 count += helper(board  , row+1);
                 board[row][j] = '.';
            }

        }

        return count ;
    }


    public boolean isSafe(char board[][] , int row , int col){
        // vertical attack 

        for(int i = row -1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // left diagnol attack

        for(int i = row -1 , j = col-1 ; i>=0 && j>=0 ; i-- , j--){
            if(board[i][j]=='Q'){
                return false ;
            }
        }

        // right diagnol attack 
        for(int i = row -1 , j = col + 1 ; i>=0 && j <board.length ; i-- , j++){
            if(board[i][j] == 'Q'){
                return false ; 
            }
        }


        // No attack case 
        return true ;
    }

}