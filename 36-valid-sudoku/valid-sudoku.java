class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check each row
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i)) {
                return false;
            }
        }

        // Check each column
        for (int i = 0; i < 9; i++) {
            if (!isValidColumn(board, i)) {
                return false;
            }
        }

        // Check each 3x3 grid
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidGrid(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValidRow(char[][] board, int row) {
        boolean[] seen = new boolean[9];
        for (int col = 0; col < 9; col++) {
            if (board[row][col] != '.') {
                int num = board[row][col] - '1';
                if (seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] board, int col) {
        boolean[] seen = new boolean[9];
        for (int row = 0; row < 9; row++) {
            if (board[row][col] != '.') {
                int num = board[row][col] - '1';
                if (seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }
        return true;
    }

    private boolean isValidGrid(char[][] board, int startRow, int startCol) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int row = startRow + i;
                int col = startCol + j;
                if (board[row][col] != '.') {
                    int num = board[row][col] - '1';
                    if (seen[num]) {
                        return false;
                    }
                    seen[num] = true;
                }
            }
        }
        return true;
    }
}