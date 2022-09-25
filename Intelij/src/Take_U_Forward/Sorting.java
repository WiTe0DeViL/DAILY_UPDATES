package Take_U_Forward;

import java.util.*;

public class Sorting {
    public static int[] Inputarray() {
        System.out.print("Enter the length of the array : ");
        Scanner sc = new Scanner(System.in);
        int array[] = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
//        int[] arr = Inputarray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int mid = arr.length / 2, left = mid - 1, right = mid + 1;
        System.out.print(arr[mid]+" ");
        while (left > -1 && right < arr.length) {
            System.out.print(arr[right++] + " ");
            System.out.print(arr[left--] + " ");
        }
    }
}
