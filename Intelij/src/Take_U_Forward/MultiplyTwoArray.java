package Take_U_Forward;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyTwoArray {
    public static int[][] getMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row for matrix one : ");
        int row = sc.nextInt();
        System.out.print("Enter the col for matrix one : ");
        int col = sc.nextInt();
        var arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {


//        int[][] arr1 = {{2, 3}, {3, 4}}, arr2 = {{5, 6, 7}, {2, 3, 4}};
        var arr1 = getMatrix();
        var arr2 = getMatrix();
        int[][] ans = new int[arr1[1].length][arr2.length];
        int sum = 0;
        if (arr1[1].length == arr2.length) {
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    for (int k = 0; k < arr1[1].length; k++) {
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    ans[i][j] = sum;
                    sum = 0;
                }
            }
        } else {
            System.out.println("Its not an Valid array");
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
