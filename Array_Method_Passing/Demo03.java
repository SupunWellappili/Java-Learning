package Array_Method_Passing;

import java.util.Random;
import java.util.Scanner;

public class Demo03 {
    public static int[] createArray(int size) {
        int[] temp = new int[size];
        return temp;
    }


    public static void readMarks(int[] ar) {
        Random input = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = input.nextInt(101);
        }
    }


    public static int total(int[] num) {
        int tot = 0;
        for (int i = 0; i < num.length; i++) {
            tot += num[i];
        }
        return tot;
    }


    public static int max(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    public static int min(int[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        return min;
    }


    public static void printMarks(int[] ar) {
        System.out.print("{");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b}");
    }


    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        System.out.print("Input No of students -: ");
        final int N = output.nextInt();
        int[] marks = createArray(N);

        //Input marks (Input random number 0 to 100)
        readMarks(marks);

        //find total
        int total = total(marks);

        //find max
        int max = max(marks);

        //find minimum
        int min = min(marks);

        printMarks(marks);//{54,23,65,86,..}
        System.out.println("Total -: " + total);
        System.out.println("Maximum -: " + max);
        System.out.println("Minimum -: " + min);
    }
}
