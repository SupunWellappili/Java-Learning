package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number -: ");
        final int N = input.nextInt();

        //Random Value Limit
        int[] xr = new int[N];
        Random output = new Random();
        for (int i = 0; i < N; i++) {
            xr[i] = output.nextInt(100);
            System.out.println((i + 1) + ") " + xr[i]);
        }

        //Total Value
        int tot = 0;
        for (int i = 0; i < N; i++) {
            tot += xr[i];
        }
        System.out.println("Total Value is - : " + tot);


        //Max Value
        int max = xr[0];
        for (int i = 0; i < N; i++) {
            if (xr[i] > max) {
                max = xr[i];
            }
        }
        System.out.println("Maximum Value is -: " + max);


        //Min Value
        int min =xr[1];
        for (int i = 0; i < N; i++) {
            if (min>xr[i]){
                min=xr[i];
            }
        }
        System.out.println("Minimum Value is -: " + min);


        //Print Value
        System.out.print("Print Value are -: [");
        for (int i = 0; i < N; i++) {
            System.out.print(xr[i]+", ");
        }

        System.out.println("\b\b]");
    }
}
