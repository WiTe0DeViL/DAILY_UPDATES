package WeeklyAssessment;

import java.util.HashMap;

public class ConvertingToWords {
    public static void main(String[] args) {
        HashMap<Integer, String> DB = new HashMap<>();
        DB.put(0, "");
        DB.put(1, "One");
        DB.put(2, "Two");
        DB.put(3, "Three");
        DB.put(4, "Four");
        DB.put(5, "Five");
        DB.put(6, "Six");
        DB.put(7, "Seven");
        DB.put(8, "Eight");
        DB.put(9, "Nine");
        DB.put(11, "Eleven");
        DB.put(12, "Twelve");
        DB.put(13, "Thirteen");
        DB.put(15, "Fifteen");
        DB.put(16, "Sixteen");
        DB.put(17, "Seventeen");
        DB.put(18, "Eighteen");
        DB.put(19, "Nineteen");
        DB.put(-1, "Hundred and");
        DB.put(10, "Ten");
        DB.put(20, "Twenty");
        DB.put(30, "Thirty");
        DB.put(40, "Forty");
        DB.put(50, "Fifty");
        DB.put(60, "Sixty");
        DB.put(70, "Seventy");
        DB.put(80, "Eighty");
        DB.put(90, "Ninety");
        StringBuilder sb = new StringBuilder();
        int a = 11;
        // Ones
        int ones = a % 10;
        a -= ones;
        int twos = a % 100;
        a -= twos;
        int threes = a / 100;
        System.out.println(threes + " " + twos + " " + ones);
        System.out.println(DB.get(threes) + " " + DB.get(-1) + " " + DB.get(twos) + " " + DB.get(ones));
    }
}
