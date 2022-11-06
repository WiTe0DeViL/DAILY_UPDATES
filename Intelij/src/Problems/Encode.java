import java.util.Arrays;
import java.util.Scanner;

public class Encode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the moves : ");
        int k = sc.nextInt();
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                if ((ch[i] + k) - 'a' > 26) {
                    int temp = (ch[i] + k) % 26;
                    ch[i] = (char) ('a' + temp);
                } else {
                    ch[i] = (char) (ch[i] + k);
                }
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                if (ch[i] + k > '9') {
                    int temp = ((ch[i] + k) - '0') % 9;
                    ch[i] = (char) (temp + '0');
                } else
                    ch[i] = (char) (ch[i] + k);
            }
        }
        System.out.println(String.valueOf(ch));
    }
}