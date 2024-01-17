package Static_Globle_Template;

import java.util.Arrays;

public class Demo06 {
    static int[] ar = {34, 12, 61, 29, 59, 94, 24, 58};

    public static void add(int data) {
        int[] temp = new int[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
        }
        temp[ar.length] = data;
        System.out.println(Arrays.toString(temp));
    }

    public static void add(int date, int index) {
        if (index >= 0 && ar.length > index) {
            int[] temp = new int[ar.length + 1];
            for (int i = 0; i < ar.length; i++) {
                if (i < index) {
                    temp[i] = ar[i];
                } else if (i == index) {
                    temp[i] = date;
                    temp[i + 1] = ar[i];

                } else {
                    temp[i + 1] = ar[i];
                }
            }
            ar = temp;
        } else {
            System.out.println("Wrong Number");
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ar));
        System.out.println("Length : " + ar.length);

        add(99);
        add(100, 4);
    }
}

