package Array_Copy;

import java.util.Arrays;

public class Demo04 {

    public static void reverse(int[] a) {
            for (int i = a.length - 1; i<=0; i--) {
               // a[i];
            }
    }

    public static void main(String[] args) {
        int[] ar = {90, 10, 80, 20, 70, 30, 60, 40, 50, 0};
        System.out.println(Arrays.toString(ar));//[90, 10, 80, 20, 70, 30, 60, 40, 50, 0]
        reverse(ar);
        System.out.println(Arrays.toString(ar));//[0,50,40,60,30,70,20,80,10,90]
    }
}



