package Hackerrank;

import java.util.ArrayList;

public class TwoStringsHackerrank {

    public static void main(String[] args) {
        System.out.println(Result.alternate("abaacdabd"));
    }
}

class Result {
    public static int alternate(String s) {
        if (s.length() <= 1)
            return 0;

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            if (!list.contains(s.charAt(i)))
                list.add(s.charAt(i));

        int max = 0;
        for (int i = 0; i < list.size(); i++)
            for (int j = i + 1; j < list.size(); j++) {
                int m = isVAlidString(list.get(i), list.get(j), s);
                max = Math.max(max, m);
            }
        return max;
    }

    private static int isVAlidString(char c1, char c2, String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c1 || s.charAt(i) == c2)
                sb.append(s.charAt(i));

        int i = 0;
        int j = 1;
        while (j < sb.length()) {
            if (sb.charAt(i) == sb.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j++;
        }
        if (flag) {
            System.out.println(sb);
            count = sb.length();
        }

        return count;
    }

}
