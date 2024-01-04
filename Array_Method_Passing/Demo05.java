package Array_Method_Passing;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int[] ar = {12, 43, 65, 3, 24, 65, 4};
        System.out.print("Arrays -: ");
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.print("Asc -: ");
        System.out.println(Arrays.toString(ar));
    }
}
