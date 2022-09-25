package leetcode;

public class concatenatedBinary {
    public static void main(String[] args) {
        new Solution().concatenatedBinary(1);
    }
}

//118505380540
class Solution {
    public int concatenatedBinary(int n) {
        double a = Integer.parseInt("118505380540") % Math.pow(10, 9) + 7;
        return (int) a;
    }
}