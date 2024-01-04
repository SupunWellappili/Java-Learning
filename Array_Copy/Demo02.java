package Array_Copy;

public class Demo02 {

    public static boolean equals(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] ar = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] br = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] cr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        int[] dr = {20, 10, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] er = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] fr = {10, 20, 40, 30, 50, 60, 70, 80, 90, 100};


        System.out.println("ar equal to br : " + equals(ar, br));//false
        System.out.println("ar equal to br : " + equals(ar, cr));//false
        System.out.println("ar equal to br : " + equals(ar, dr));//false
        System.out.println("ar equal to br : " + equals(ar, er));//true
        System.out.println("ar equal to fr : " + equals(ar, fr));//false

    }
}
