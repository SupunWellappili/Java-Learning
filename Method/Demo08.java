package Method;

import java.util.Scanner;

public class Demo08 {
        public static int fac(int f) {
            if (f == 0) {
                return 1;
            } else {
                return f * fac(f - 1);
            }
        }


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert Your Number -: ");
            int f = input.nextInt();
            System.out.println(fac(f));
        }
    }
