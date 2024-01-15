package Arrays_Sort;

import java.util.Arrays;

public class Demo02 {
    public static int[] mergeArray(int[] ar, int[] br) {
        int[] temp = new int[ar.length + br.length];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
        }

        for (int i = 0; i < br.length; i++) {
            temp[ar.length + 1] = br[i];
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40, 50};
        int[] br = {1, 2, 3, 4, 5, 6, 7};
        int[] cr;
        cr = mergeArray(ar, br);

        System.out.println(Arrays.toString(ar));//10, 20, 30, 40, 50
        System.out.println(Arrays.toString(br));//1, 2, 3, 4, 5, 6, 7
        System.out.println(Arrays.toString(cr));//10, 20, 30, 40, 50,1, 2, 3, 4, 5, 6, 7
    }
}
