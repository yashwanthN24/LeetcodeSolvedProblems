class Solution {

    public void helper(char board[][] , List<List<String>> allboards , int row){

        if(row == board.length){
            saveBoard(board , allboards);
            return ;
        }

        for(int j = 0 ; j< board.length ; j++){
            if(isSafe(board , row , j)){
                 board[row][j] ='Q';
                 helper(board , allboards , row+1);
                 board[row][j] = '.';
            }

        }
    }

    public void saveBoard(char board[][] , List<List<String>> allboards){
        String row = "";
        List<String> solution = new ArrayList<>();

        for(int i = 0 ; i <board.length ; i++){
            row = "";
            for(int j = 0 ; j<board.length ; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.' ;
                }
                
            }
            solution.add(row);
        }

        allboards.add(solution);
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

    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        List<List<String>> allboards = new ArrayList<>();
        helper(board , allboards , 0);
        return allboards;
    }
}