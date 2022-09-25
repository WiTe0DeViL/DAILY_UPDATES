package Take_U_Forward;

import java.util.Arrays;
import java.util.Comparator;

public class Weights {
    public static void main(String[] args) {
        var arr = new int[]{49, 36, 8, 10, 12};
        var ans = new int[arr.length][2];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = 0;
            if (PerfectSquare(arr[i]))
                val += 5;
            if (arr[i] % 4 == 0 && arr[i] % 6 == 0)
                val += 4;
            if (arr[i] % 2 == 0)
                val += 3;

            ans[ind][0] = arr[i];
            ans[ind][1] = val;

            ind++;
        }
        Arrays.sort(ans, Comparator.comparing(o2 -> o2[1]));
        for (int x = ans.length - 1; x >= 0; x--)
            System.out.print("<" + ans[x][0] + " ," + ans[x][1] + "> ");


    }

    public static boolean PerfectSquare(int num) {
        for (int i = 0; i < num / 2; i++) {
            int X = i * i;
            if (X == num)
                return true;
            else if (X > num)
                return false;
        }
        return false;
    }
}
