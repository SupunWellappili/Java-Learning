package Array_Method_Passing;

public class Demo02 {
    public static void increment(int a, int b, int c) {
        a++;
        b++;
        c++;

    }

    public static void increment(int a[]) {
        a[0]++;
        a[1]++;
        a[2]++;
    }

    public static void main(String[] args) {
        int[] ar = {100, 200, 300};
        System.out.println(ar[0] + ", " + ar[1] + ", " + ar[2]);//100,200,300

        increment(ar[0], ar[1], ar[2]);//Object Value Pass
        System.out.println(ar[0] + ", " + ar[1] + ", " + ar[2]);//100,200,300

        increment(ar);//Array Reference Pass
        System.out.println(ar[0] + ", " + ar[1] + ", " + ar[2]);//101,201,301


    }
}
