package Arrays;
import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        int[] xr = {12, 44, 55, 43, 566, 77, 65, 4};
        System.out.println(Arrays.toString(xr));
        for (int b : xr) {
            b++;
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(xr));
    }

}

