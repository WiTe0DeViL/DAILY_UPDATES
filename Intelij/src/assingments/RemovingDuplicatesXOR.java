package assingments;

public class RemovingDuplicatesXOR {
    public static void main(String[] args) {
        var arr = new int[]{601, 602, 603, 604, 605, 606, 606, 607};
        int dupe = 0;
        for (int i = 0; i < arr.length; i++) {
            dupe = dupe ^ arr[i] ^ i;
//            System.out.println(arr[i] ^ i);
            System.out.println(dupe);
        }
    }
}
