package leetcode;

class NQueens {
    public static void main(String[] args) {
        int n = 4;
        String[][] board = new String[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = "_";

        solveQueens(board, 0, n);
    }


    private static void solveQueens(String[][] board, int col, int n) {
        if (col == n) {
            display(board);
            System.out.println();
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = "Q";
                solveQueens(board, col + 1, n);
                board[row][col] = "_";
            }
        }
    }

    private static void display(String[][] board) {
        for (String[] strings : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" " + strings[j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(String[][] board, int row, int col, int n) {
        return !leftDiagonal(board, row, col) &&
                !rightDiagonal(board, row, col, n) &&
                !sameRow(board, row, col);
    }

    private static boolean leftDiagonal(String[][] board, int row, int col) {
        while (row >= 0 && col >= 0) {
            if (board[row][col].equals("Q"))
                return true;
            row--;
            col--;
        }
        return false;
    }

    private static boolean rightDiagonal(String[][] board, int row, int col, int n) {
        while (row < n && col >= 0) {
            if (board[row][col].equals("Q"))
                return true;
            row++;
            col--;
        }
        return false;
    }

    private static boolean sameRow(String[][] board, int row, int col) {
        while (col >= 0) {
            if (board[row][col].equals("Q"))
                return true;
            col--;
        }
        return false;
    }

}

