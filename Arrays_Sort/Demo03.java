package Arrays_Sort;
import java.util.Arrays;

 class Demo03 {
     public static void copyValuesFromTo(int[] a, int[] b) {
         int minLength = a.length < b.length ? a.length : b.length;
         for (int i = 0; i < minLength; i++) {
             b[i] = a[i];
         }
     }


     public static void main(String[] args) {
         int[] ar = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
         int[] br = new int[6];
         int[] cr = new int[15];

         copyValuesFromTo(ar, br);
         copyValuesFromTo(ar, cr);
         System.out.println(Arrays.toString(br));
         System.out.println(Arrays.toString(cr));
     }

 }

