package Array_Glowable;

import java.util.Arrays;

public class Demo01 {

    public static void add(int[] x, int y) {
        int[] p = new int[x.length+1];
        for (int i = 0; i <x.length ; i++) {
            p[i]=x[i];
        }
        p[x.length]=99;
        System.out.println(Arrays.toString(p));
    }

    public static void main(String[] args) {
        int[] ar = {34, 12, 61, 29, 59, 94, 24, 58};
        System.out.println(Arrays.toString(ar));
        add(ar, 99);
    }
}
