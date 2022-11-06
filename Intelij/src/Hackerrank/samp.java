package Hackerrank;

public class samp {
    String a = "suren";
    int i = 1;

    public static void main(String[] args) {
        new samp().state();
    }

    private void state() {
        String b = "vipin";
        int j = 2;
        a = b;
        i = j;
        System.out.println(a);
        System.out.println(i);
    }


}
