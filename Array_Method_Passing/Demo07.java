package Array_Method_Passing;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int[] ar = {34, 65, 65, 4, 36, 87, 674, 56};
        System.out.println(Arrays.toString(ar));
        System.out.println("---------------------------------");

        for (int x : ar
        ) {
            x++;
       // System.out.println(x);
        }
        System.out.println(Arrays.toString(ar));//[34, 65, 65, 4, 36, 87, 674, 56]

        for (int i = 0; i < ar.length; i++) {
            ar[i]++;
        }
        System.out.println(Arrays.toString(ar));//[35, 66, 66, 5, 37, 88, 675, 57]
    }
}
