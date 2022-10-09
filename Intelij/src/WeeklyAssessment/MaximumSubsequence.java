package WeeklyAssessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumSubsequence {
    public static void main(String[] args) {
//        Integer[] arr = {5, -1, -2, -3, -4, -6};
        Integer[] arr = {1, -2, 3, -4, 20, 1, -2, -3};
        int max = 0, sum = 0;
        HashMap<Integer, Integer[]> maximumSubArray = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Getting the Sub array
                sum = subset(i, j, arr);
                // Calculating maximum value
                max = Math.max(max, sum);
                // temArray
                Integer[] tempArray = new Integer[j + 1];
                for (int index = i; index <= j; index++) {
                    tempArray[index] = arr[index];
                }
                maximumSubArray.put(sum, tempArray);
            }
        }
        for (Map.Entry<Integer, Integer[]> entry : maximumSubArray.entrySet()) {
            if (entry.getKey() == max) {
                for (int values = 0; values < entry.getValue().length; values++) {
                    if (entry.getValue()[values] != null)
                        System.out.print(arr[values] + " ");
                }

            }
        }

    }

    private static int subset(int start, int end, Integer[] arr) {
        int sum = 0;
        while (start <= end) {
            sum += arr[start];
            start++;
        }
        return sum;
    }
}
