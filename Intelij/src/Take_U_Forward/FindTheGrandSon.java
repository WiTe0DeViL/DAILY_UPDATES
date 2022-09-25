package Take_U_Forward;

import java.util.*;

public class FindTheGrandSon {

    public static void main(String[] args) {
        String[][] input = {{"luke", "shaw"}, {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}};
        String Father = "rooney";
        var Sons = FindSons(input, Father);
        int ans = FindGrandSon(input, Sons);
        System.out.println(ans);
    }

    private static int FindGrandSon(String[][] input, List<String> sons) {
        int prev_count = 0;
        for (String s : sons) {
            int count = 0;
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input[i].length; j++) {
                    if (s.equals(input[i][j]) && j != 0)
                        count++;
                }
            }
            prev_count = Math.max(count, prev_count);
        }
        return prev_count;
    }


    private static List<String> FindSons(String[][] input, String father) {
        var Sons = new ArrayList<String>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j].equals(father) && j != 0)
                    Sons.add(input[i][0]);
            }
        }
        return Sons;
    }

}

