package Array_Method_Passing;

import java.util.Arrays;
import java.util.Random;

public class Demo12 {

    public static void convertToAbs(int[] xr) {
        for (int i = 0; i < xr.length; i++) {
            if (xr[i] < 0) {
                xr[i] = -xr[i];
            }
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] ar = new int[20];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = r.nextInt() % 100; //-99 to 99
        }
        System.out.println(Arrays.toString(ar));


        convertToAbs(ar);

        System.out.println(Arrays.toString(ar));//positive integer


    }
}
