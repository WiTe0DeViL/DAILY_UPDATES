public class SudukoSolver {
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        displayBoard(board);
        if (solve(board)) System.out.println("Solved Successfully");
        else System.out.println("Impossible Suduko!");
        displayBoard(board);
    }

    private static void displayBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0)
                System.out.println("-----------");
            for (int column = 0; column < GRID_SIZE; column++) {
                if (column % 3 == 0 && column != 0)
                    System.out.print("|");
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }


    private static boolean isValidInRow(int[][] board, int numberToFind, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == numberToFind)
                return true;
        }
        return false;
    }

    private static boolean isValidInColumn(int[][] board, int numberToFind, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == numberToFind)
                return true;
        }
        return false;
    }

    private static boolean isValidInBox(int[][] board, int numberToFind, int row, int column) {
        int currBoxRow = row - row % 3;
        int currBoxColumn = column - column % 3;

        for (int i = currBoxRow; i < currBoxRow + 3; i++) {
            for (int j = currBoxColumn; j < currBoxColumn + 3; j++) {
                if (board[i][j] == numberToFind)
                    return true;
            }
        }
        return false;
    }

    private static boolean isValid(int[][] board, int numberToFind, int row, int column) {
        return !isValidInRow(board, numberToFind, row) &&
                !isValidInColumn(board, numberToFind, column) &&
                !isValidInBox(board, numberToFind, row, column);
    }

    private static boolean solve(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (board[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        if (isValid(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;

                            if (solve(board)) return true;
                            else board[row][column] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}