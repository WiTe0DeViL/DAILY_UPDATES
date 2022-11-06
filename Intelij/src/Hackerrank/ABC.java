package Hackerrank;

public class ABC {

    private static String combinations = "";

    public static void main(String[] args) {
        String[] array = {"a", "b", "c"};
        recursive(array, 0, 0);
        System.out.println(count);
    }

    static int count;

    private static void recursive(String[] array, int bCount, int cCount) {
        if (combinations.length() == 3) {
            System.out.println(combinations);
            count++;
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                if (bCount >= 1)
                    continue;
                else
                    bCount++;
            }
            if (i == 2)
                if (cCount >= 2)
                    continue;
                else
                    cCount++;
            combinations += array[i];
            recursive(array, bCount, cCount);
            combinations = combinations.substring(0, combinations.length() - 1);
            if (i == 1) bCount--;
            if (i == 2) cCount--;
        }
    }
}