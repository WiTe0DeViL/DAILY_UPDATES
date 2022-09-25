package Pattern;

public class Heart {
    public static void main(String[] args) {
        String str = "vignesh";
        for (int i = 0; i < 2; i++)
            str += str;
        char[] name = str.toCharArray();
//        System.out.println(name);
        for (int i = 0; i < name.length/2; i++) {
            for (int j = 0; j < name.length; j++) {
                System.out.print(name[j]);
            }
            System.out.println();
        }

    }
}
