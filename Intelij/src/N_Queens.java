public class N_Queens {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        if (findSol(board, 0)) {
            System.out.println("Success");
            for (int[] arr : board) {
                for (int j : arr)
                    System.out.print(j + " ");
                System.out.println();
            }
        }
    }

    private static boolean findSol(int[][] board, int col) {
        if (col >= 4) return true;
        for (int row = 0; row < 4; row++) {
            if (isPossibleQuees(board, row, col)) {
                board[row][col] = 1;
                if (findSol(board, col + 1)) return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isPossibleQuees(int[][] board, int row, int col) {
        // check in column
        for (int i = 0; i < col; i++) {
            if (board[row][i] != 0)
                return false;
        }
        // check in Top left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] != 0)
                return false;
        }
        // check in Bottom left diagonal
        for (int i = row, j = col; i < 4 && j >= 0; i++, j--) {
            if (board[i][j] != 0)
                return false;
        }
        return true;
    }
}
