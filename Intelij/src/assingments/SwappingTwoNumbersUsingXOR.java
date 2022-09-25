package assingments;

public class SwappingTwoNumbersUsingXOR {
    public static void main(String[] args) {
        int a = 20, b = 30;
        System.out.print("Before Swapping : ");
        System.out.printf("%d %d", a, b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping : " + a + " " + b);

    }
}
