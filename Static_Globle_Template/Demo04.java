package Static_Globle_Template;

import java.util.Arrays;

public class Demo04 {
    static int[] xr = {10, 20, 30, 40, 50};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(xr));
        Increment();
        System.out.println(Arrays.toString(xr));
    }

    public static void Increment() {
        for (int i = 0; i < xr.length; i++) {
            xr[i]++;
        }
    }
}
