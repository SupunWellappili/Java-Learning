package Array_Method_Passing;

public class Demo01 {

    public static void printArray(int xr[]) {
        System.out.print("[");
        for (int i = 0; i < xr.length; i++) {
            System.out.print(xr[0] + ", ");

        }
        System.out.println("\b\b]");
    }

    public static void main(String[] args) {
        int[] xr = {20, 40, 43, 34, 2, 3};
        printArray(xr);
    }
}
