import java.util.Scanner;

public class FindTheSeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the seat number : ");
        int n = sc.nextInt();
        n = n%6;
        if(n == 1 || n == 0)
            System.out.println("WS");
        else if(n == 2 || n == 5)
            System.out.println("MS");
        else
            System.out.println("AS");
    }
}
