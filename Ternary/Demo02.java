package Ternary;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        int  x =3 , y=5;
        int z;

        z = x & y;
        System.out.println(z);//1

        z = x|y;
        System.out.println(z);//1

        //3--> 011 5 --> 101
        //3 & 5 --> 001
        //3 | 5 --> 111
    }
}
