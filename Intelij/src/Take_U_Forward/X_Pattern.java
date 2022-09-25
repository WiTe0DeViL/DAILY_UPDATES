package Take_U_Forward;

import java.util.Scanner;

public class X_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (i == j || i + j == word.length() - 1)
                    System.out.print(word.charAt(i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
