package Array_Searching;
import java.util.Arrays;

public class Demo03 {
    public static boolean search(int[] a ,int b){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b){
                return true;
            }
        } return false;
    }

    public static void main(String[] args) {
        int[] xr = {43, 23, 54, 56, 76, 89, 56, 87, 26, 59, 21, 72};
        System.out.println(Arrays.toString(xr));

        System.out.println("56 is exist :" + search(xr, 56));//true
        System.out.println("99 is exist :" + search(xr, 99));//false

    }
}
