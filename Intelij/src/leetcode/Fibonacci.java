package leetcode;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fib(n));
    }

    /*    private static int Fib(int n) {

            if(n == 1)
                return 0;
            if(n == 2)
                return 1;
            return Fib(n-1)+Fib(n-2);
        }*/
    private static int Fib(int n) {
        int c=0, a = 1, b = 1;
        System.out.print("Fibnocci serires to "+n+" is : "+a+" "+a+" ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c +" ");
            a = b;
            b = c;
        }
        System.out.println();
        return c;
    }
}
