package Take_U_Forward;

import java.lang.*;

public class Array_1 {
    public static void main(String[] args) {
        var arr = new int[]{8, 10, 5, 7, 9};
        int max = Integer.MIN_VALUE;
        for(int i : arr)
            max = Math.max(max, i);
        System.out.println(max);
    }
}
