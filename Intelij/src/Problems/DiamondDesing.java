public class DiamondDesing {
    public static void main(String[] args) {
        int n = 101;
        int N = n / 2;
        for (int i = N; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = N; j >= i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i; j < N ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}