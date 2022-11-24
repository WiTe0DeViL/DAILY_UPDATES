package leetcode;

public class snakematrix {
    public static void main(String[] args) {
        int n = 4;
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int space = i; space < n-1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%3d", x);
                    x++;
                } else {
                    x--;
                    System.out.printf("%3d", x);
                }
            }
            x = x + n;
            System.out.println();
        }
    }
}
