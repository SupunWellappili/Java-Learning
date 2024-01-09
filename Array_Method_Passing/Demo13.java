package Array_Method_Passing;

public class Demo13 {

    public static boolean equals(int[] a, int[] b) {
        for (int i = (a.length-1); i >= 0; i--) {
            if (a[i] == b[i]){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 2};
        int[] br = {2, 5, 4, 3, 2, 1};
        int[] cr = {2, 4, 5, 2, 1, 3};
        int[] dr = {2, 4, 99, 1, 3, 2};
        int[] er = {2, 4, 5, 1, 3, 6};
        int[] fr = {2, 5, 1, 3};

        System.out.println("ar equals to br : " + equals(ar, br));//true
        System.out.println("ar equals to cr : " + equals(ar, cr));//true
        System.out.println("ar equals to dr : " + equals(ar, dr));//false
        System.out.println("ar equals to er : " + equals(ar, er));//false
        System.out.println("ar equals to fr : " + equals(ar, fr));//false
    }
}

