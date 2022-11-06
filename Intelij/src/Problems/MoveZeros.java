import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                swap(array, j, i);
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
