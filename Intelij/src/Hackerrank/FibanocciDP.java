package Hackerrank;

import java.util.ArrayList;

public class FibanocciDP {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    static int[] cache = new int[1000];

    private static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        if (cache[n] != 0) {
            return cache[n];
        } else {
            cache[n] = fib(n - 1) + fib(n - 2);
        }
        return cache[n];
    }
}
