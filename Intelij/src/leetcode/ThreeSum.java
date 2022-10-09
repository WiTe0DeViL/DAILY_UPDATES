package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        if (n == 3)
            return nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                int diff = target - sum;
                if (Math.abs(diff) < Math.abs(minDiff))
                    minDiff = diff;

                if (minDiff == 0)
                    break;

                if (sum < target)
                    left++;
                else
                    right--;
            }
        }

        return target - minDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Constrains");
        System.out.println(
                "1. 3 <= nums.length <= 1000\n" +
                        "2. -1000 <= nums[i] <= 1000\n" +
                        "3. -104 <= target <= 104\n");
        int n = sc.nextInt();
        while ((n < 3 || n > 1000)) {
            System.out.println("Enter a valid input : ");
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            while (!(-1000 <= val && val <= 1000)) {
                System.out.println("Enter a correct number : ");
                val = sc.nextInt();
            }
            arr[i] = val;
        }
        threeSumClosest(new int[]{-1, 2, 1, -4}, 1);

        sc.close();
    }
}
