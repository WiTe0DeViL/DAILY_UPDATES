package Take_U_Forward;

import java.util.Arrays;
import java.util.Comparator;

public class Compare {
    public static void main(String[] args) {
        var arr = new int[][]{{12, 5}, {92834, 4}, {286, 3}, {8734, 1}, {3654, 2}};
        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        for (int[] i : arr) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
