package leetcode;

import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int n = 10;
        int[][] arr = new int[n][n];
        int val = 1;
        // fill diagonal
        int i = 0;
        int j = 0;
        int checker = n;
        while (checker > 0) {
            while (i < n && j < n) {
                if (arr[i][j] == 0)
                    arr[i][j] = val++;
                i++;
                j++;
            }
            checker--;

            i -= 2;
            j -= 1;
            // fill upper
            while (i >= 0) {
                if (arr[i][j] == 0)
                    arr[i][j] = val++;
                i--;
            }
            checker--;

            i += 1;
            // fill left
            while (j >= 0) {
                if (arr[i][j] == 0)
                    arr[i][j] = val++;
                j--;
            }
            checker--;
            i += 1;
            j += 3;
        }
        for (int[] x : arr) {
            for (int y : x)
                System.out.printf("%2d ", y);
            System.out.println();
        }
    }
}
