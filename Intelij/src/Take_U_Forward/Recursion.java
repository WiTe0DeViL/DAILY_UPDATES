package Take_U_Forward;

public class Recursion {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));
    }

    private static int fact(int a) {
        if (a == 1)
            return 1;
        return a * fact(a - 1);
    }
}
