package Array_Copy;

import java.util.Arrays;

public class Demo03 {

    public static void reverse(int[] x) {
        Arrays.sort(x);
    }

    public static void main(String[] args) {

        int[] ar = {90, 10, 80, 20, 70, 30, 60, 40, 50, 0};
        System.out.println(Arrays.toString(ar));//[90, 10, 80, 20, 70, 30, 60, 40, 50, 0]
        reverse(ar);
        System.out.println(Arrays.toString(ar));//[0,50,40,60,30,70,20,80,10,90]
    }
}

