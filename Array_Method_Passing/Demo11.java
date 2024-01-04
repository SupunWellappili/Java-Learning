package Array_Method_Passing;

import java.util.Arrays;

public class Demo11 {
    public static void main(String[] args) {
        int[] x = {12, 43, 67, 98, 34, 55};
        System.out.print("[");

        //Reverse print Arrays [55,34,98,67,43,12]
        for (int i = x.length-1; i > 0; i--) {
            System.out.print(x[i]+", ");
        }

        System.out.println("\b\b]");
    }
}
