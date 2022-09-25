package assingments;

public class FindingUniqueElementXOR {
    public static void main(String[] args) {
        var arr = new int[]{1, 2, 3,5, 1, 2, 3};
        var unique = 0;
        for (int i : arr)
            unique ^= i;
        System.out.println(unique);
    }
}
