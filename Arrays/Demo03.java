package Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] xr = {12, 34, 56, 76};
        System.out.print("[");
        for (int i = 0; i < xr.length; i++) {
            System.out.print(xr[i] + ", ");
        }

        System.out.println("\b\b]");

        System.out.print("[");
        int [][] yr ={{34,53,43,34},{12,44,56,76},{87,9,67,5}};
        System.out.print(yr[2][3]+", ");
        System.out.println("\b\b]");
    }
}
