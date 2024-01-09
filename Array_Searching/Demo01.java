package Array_Searching;

import java.util.Arrays;
/*
public class Demo01 {

    public static int searchArray(int[] a, int data) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == data) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] xr = {43, 23, 54, 56, 76, 89, 78,12, 87, 26, 59, 21, 72};
        System.out.println(Arrays.toString(xr));

        int index;
        index = searchArray(xr, 56);
        System.out.println("index of 56 is : " + index);//-3

        index = searchArray(xr, 99);
        System.out.println("index of 99 is : " + index);//-1

    }
}
*/


//++++++++++++________OR_____++++++++++++++++++++++++++++


class Demo01 {
    public static int searchArray(int[] a, int data) {
        for (int i = 0; i < a.length; i++) {
            if (data==a[i] ) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] xr = {43, 23, 54, 56, 76, 89, 78,12, 87, 26, 59, 21, 72};
        System.out.println(Arrays.toString(xr));

        int index;
        index = searchArray(xr, 56);
        System.out.println("index of 56 is : " + index);//3

        index = searchArray(xr, 99);
        System.out.println("index of 99 is : " + index);//-1

    }
}
