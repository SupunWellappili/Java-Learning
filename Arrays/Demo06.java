package Arrays;
public class Demo06 {
    public static void main(String args[]) {
        int[] ar = {10, 34, 56, 783, 232};
        System.out.println(ar[0] + " " + ar[1] + " " + ar[2] + " " + ar[3] + " " + ar[4]);

        increment(ar[0], ar[1], ar[2], ar[3]);
        System.out.println(ar[0] + " " + ar[1] + " " + ar[2] + " " + ar[3]);

        increment(ar);
        System.out.println(ar[0] + " " + ar[1]);
    }

    public static void increment(int[] a) {
        a[0]++;
        a[1]++;

    }

    public static void increment(int a, int b, int c, int d) {
        a++;
        b++;
        c++;
        d++;
    }
}

