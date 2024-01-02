package Arrays;
import java.util.Scanner;
public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] xr = new int[10];
        int tot = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + " -: ");
            xr[i] = input.nextInt();
            tot += xr[i];
        }

        System.out.println("Total is -: " + tot);

        int max = xr[0];
        for (int i = 0; i < 10; i++) {
            if (xr[i] > max) {
                max = xr[i];
            }
        }
        System.out.println("Max Num is -: "+max);
    }
}