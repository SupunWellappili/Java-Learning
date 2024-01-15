package Arrays_Sort;

import java.util.Arrays;

public class Demo01 {
    public static void sort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            for (int i = 1; i < a.length - 1; i++) {
                if (a[i + 1] < a[i]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] xr = {43, 98, 54, 56, 76, 89, 37, 87, 26, 59, 21, 72};
        System.out.println(Arrays.toString(xr));

        sort(xr);
        System.out.println(Arrays.toString(xr));
    }
}

