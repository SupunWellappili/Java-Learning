package Array_Searching;

import java.util.Arrays;

public class Demo04 {

    public static int[] marge(int[] ar, int[] br) {
        int[] marge = new int[ar.length + br.length];
        for (int i = 0; i < ar.length; i++) {
            marge[i] = ar[i];
        }
        for (int j = 0; j < br.length; j++) {
            marge[ar.length + j] = br[j];
        }return marge;
    }


    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int[] br = {10, 20, 30, 40, 50, 60, 70};

        int[] cr = marge(ar, br);
        System.out.println(Arrays.toString(cr));//[1,2,3,4,5,10,20,30,40,50,60,70]
    }
}
