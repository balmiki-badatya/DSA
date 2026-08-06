class Solution {
    public boolean exist(char[][] board, String word) {
        boolean isExist = false;
        int rows = board.length;
        int cols = board[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == word.charAt(0)) {
                    if (checkIfExist(board, word, 0, row, col)) {
                        isExist = true;
                        break;
                    }
                }
            }

        }

        return isExist;
    }

    private boolean checkIfExist(char[][] board, String word, int cIndex, int row, int col) {
        if (word.length() == cIndex) {
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
            || board[row][col] != word.charAt(cIndex)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = ' ';

        boolean isExist = checkIfExist(board, word, cIndex + 1, row + 1, col) ||
                        checkIfExist(board, word, cIndex + 1, row - 1, col) ||
                        checkIfExist(board, word, cIndex + 1, row, col + 1) ||
                        checkIfExist(board, word, cIndex + 1, row , col - 1);

        board[row][col] = temp;

        return isExist;
    }
}
