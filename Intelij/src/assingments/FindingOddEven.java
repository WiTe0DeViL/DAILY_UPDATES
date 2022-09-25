package assingments;

import java.util.Scanner;

public class FindingOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a & 1) == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}
