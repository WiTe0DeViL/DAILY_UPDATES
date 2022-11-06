import java.util.HashMap;
import java.util.Map;

public class TwoString {
    public static void main(String[] args) {
        String str1 = "momo";
        String str2 = "ddad";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max = max > map.get(ch) ? max : map.get(ch);
        }
        int max1 = Integer.MIN_VALUE;
        for (char ch : str2.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            max1 = max1 > map1.get(ch) ? max1 : map1.get(ch);

        }
        System.out.println(max == max1);

    }

}