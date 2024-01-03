package Arrays_Declaration;

public class Demo05 {
    public static void main(String[] args) {
        int[]  pr = new  int[4];
        int[] qr = new int[10];

        pr[3] = 1234;
        System.out.println(pr[3]);

        pr[-1] = 234;//Compile Time Run But,Runtime Error
        System.out.println(pr[-1]);
    }
}
