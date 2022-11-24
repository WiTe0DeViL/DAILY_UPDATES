package Hackerrank;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"tech", "tecnbt", "technology"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 1;
            String updatePrefix = "";
            while (j <= strs[i].length() && j <= prefix.length() && prefix.substring(0, j).equals(strs[i].substring(0, j))) {
                updatePrefix = prefix.substring(0, j);
                j++;
            }
            prefix = updatePrefix;
        }
        return prefix;
    }
}

