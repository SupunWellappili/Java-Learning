package Static_Globle_Template;

import java.util.Arrays;

public class Demo05 {
    static int[] ar = {34, 12, 61, 29, 59, 94, 24, 58};

    public static void add(int x) {
        int[] p = new int[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            p[i] = ar[i];
        }
        p[ar.length] = x;
        System.out.println(Arrays.toString(p));
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ar));
        add(99);
        add(123);

    }
}
