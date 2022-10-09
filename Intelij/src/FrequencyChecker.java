import java.util.HashMap;
import java.util.Map;

public class FrequencyChecker {
    public static void main(String[] args) {
        int[][] rangeOfYear = {{1901, 1903}, {1901, 1902}, {1901, 1902},
//                {1943, 1950},
//                {1910, 1945},
//                {1905, 1909},
//                {1955, 1956},
//                {1913, 1929},
//                {1945, 1999},
//                {1915, 1969}
        };
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int[] years : rangeOfYear) {
            int start = years[0], end = years[1];
            while (start <= end) {
//                map.put(start, map.getOrDefault(start, 0) + 1);
                if (map.containsKey(start))
                    map.put(start, map.get(start) + 1);
                else
                    map.put(start, 1);
                max = max > map.get(start) ? max : map.get(start);
                start++;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) System.out.print(entry.getKey() + " ");
        }
        System.out.println("\nMaximum persons in all years : " + max);
//        System.out.println(peopleCounts);
    }
}
