package Take_U_Forward;

import java.util.HashSet;

public class Array_2 {
    public static void main(String[] args) {
        var arr = new int[]{1,2,3,4,5,5,6,7,7,7,8,8};
        int ss=Integer.MAX_VALUE,s=Integer.MAX_VALUE,m=Integer.MIN_VALUE,sm=Integer.MIN_VALUE;
        for(int i : arr){
            ss = s;
            s = Math.min(i, s);
            sm = m;
            m = Math.max(i, m);
        }
        System.out.println(ss+" "+sm);

    }
}
