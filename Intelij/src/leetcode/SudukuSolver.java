package leetcode;

/*37. Sudoku Solver
Hard

Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

    Each of the digits 1-9 must occur exactly once in each row.
    Each of the digits 1-9 must occur exactly once in each column.
    Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

The '.' character indicates empty cells.



Example 1:

Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
Explanation: The input board is shown above and the only valid solution is shown below:




Constraints:

    board.length == 9
    board[i].length == 9
    board[i][j] is a digit or '.'.
    It is guaranteed that the input board has only one solution.

*/
public class SudukuSolver {
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        Solver obj = new Solver();
        obj.solveSudoku(board);
        displayBoard(board);
    }

    private static void displayBoard(char[][] board) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i % 3 == 0 && i != 0) System.out.println("-----------");
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j % 3 == 0 && j != 0) System.out.print("|");
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

}

class Solver {
    private final int GRID_SIZE = 9;

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (board[i][j] == '.') {
                    for (char numberToFind = '1'; numberToFind <= '9'; numberToFind++) {
                        if (isValid(board, numberToFind, i, j)) {
                            board[i][j] = numberToFind;

                            if (solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidInRow(char[][] board, char numberToFind, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == numberToFind) return true;
        }
        return false;
    }

    public boolean isValidInCol(char[][] board, char numberToFind, int col) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == numberToFind) return true;
        }
        return false;
    }

    public boolean isValidBox(char[][] board, char numberToFind, int row, int col) {
        int currRow = row - row % 3;
        int currCol = col - col % 3;
        for (int i = currRow; i < currRow + 3; i++) {
            for (int j = currCol; j < currCol + 3; j++) {
                if (board[i][j] == numberToFind) return true;
            }
        }
        return false;
    }

    public boolean isValid(char[][] board, char numberToFind, int row, int col) {
        return !isValidInRow(board, numberToFind, row) &&
                !isValidInCol(board, numberToFind, col) &&
                !isValidBox(board, numberToFind, row, col);
    }

}
