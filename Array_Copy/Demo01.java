package Array_Copy;

import java.util.Arrays;

public class Demo01 {

    public static void copyValuesFromTo(int[] xr, int[] yr) {
        int minLength = xr.length < yr.length ? xr.length : yr.length;
        for (int i = 0; i < minLength; i++) {
            yr[i] = xr[i];
        }
    }

    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] br = new int[6];
        int[] cr = new int[15];

        copyValuesFromTo(ar, br);
        copyValuesFromTo(ar, cr);
        System.out.println(Arrays.toString(br));//[10,20,30,40,50,60]
        System.out.println(Arrays.toString(cr));//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100,0,0,0,0,0]

    }
}
