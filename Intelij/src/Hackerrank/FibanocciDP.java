package Hackerrank;

public class FibanocciDP {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }

    static long[] cache = new long[1000];

    private static long fib(int n) {
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
