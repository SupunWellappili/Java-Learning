package Char_Arrays;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        String name = "Supun Wellappili";
        char[] ch = name.toCharArray();

        System.out.println("String Type -: " + name);

        System.out.print("Char Type -: ");
        System.out.println(ch);

        System.out.println("Arrays Type -: " + Arrays.toString(ch));


        System.out.print("For Loops Type -: ");
        System.out.print("[");
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i]+", ");
        }
        System.out.println("\b\b]");


        System.out.print("For Loops reverse Type -: ");
        System.out.print("[");
        for (int i = ch.length-1; i >=0 ; i--) {
            System.out.print(ch[i]+", ");
        }
        System.out.println("\b\b]");

        System.out.print("For Loops reverse Other Type -: ");
        for (int i = 1; i <= ch.length; i++) {
            System.out.print(ch[ch.length - i] + ", ");//a, n, a, d, n, a, h, C,  , n, u, p, u, S,
        }


    }
}
