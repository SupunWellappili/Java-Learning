package Array_Method_Passing;

import java.util.Arrays;

public class demo14 {

    public static void copyValuesFromTo(int[] ar, int[] br) {
        for (int i = 0; i < br.length; i++) {
            br[i] = ar[i];
        }
    }

    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40, 50, 60};
        int[] br = new int[ar.length];
        System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60]
        System.out.println(Arrays.toString(br));//[0,0,0,0,0,0]
        copyValuesFromTo(ar, br);
        System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60]
        System.out.println(Arrays.toString(br));//[10,20,30,40,50,60]
    }
}

//Reference address samana karama values change nowee samana wenne address akai(java wala ahemai but python ahema netha.)
