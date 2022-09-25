package leetcode;

import java.util.*;

// 2149. Rearrange Array Elements by Sign
public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(Solution(array)));

    }

    private static int[] getArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size Of Array : ");
        int size = scan.nextInt();
        int[] array;
        if (size < 0) {
            System.out.println("Enter the valid size");
            getArray();
        } else {
            array = new int[size];
            System.out.println("Enter equal number of positives and negatives : ");
            for (int i = 0; i < size; i++) {
                array[i] = scan.nextInt();
            }
            return array;
        }
        return null;
    }


    // TLE is 27 ms
//    private static int[] Solution(int[] array) {
//        int length = array.length;
//        Queue<Integer> positiveQueue = new ArrayDeque<>(), negativeQueue = new ArrayDeque<>();
//        int[] ansArray = new int[length];
//        for (int i : array) {
//            if (i > 0)
//                positiveQueue.add(i);
//            else
//                negativeQueue.add(i);
//        }
//        for (int j = 0; j < length; j++) {
//            if (j % 2 == 0)
//                ansArray[j] = positiveQueue.poll();
//            else
//                ansArray[j] = negativeQueue.poll();
//        }
//        return ansArray;
//    }


    // TLE is 6ms
    private static int[] Solution(int[] array) {
        int[] answerArray = new int[array.length];
        int oddIndex = 0, evenIndex = 1;
        for (int i : array) {
            if (i > 0) {
                answerArray[oddIndex] = i;
                oddIndex += 2;
            } else {
                answerArray[evenIndex] = i;
                evenIndex += 2;
            }
        }
        return answerArray;
    }
}

