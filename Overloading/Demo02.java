package Overloading;

public class Demo02 {
    public static void main(String[] args) {
        int x = -1232;
        long y = -6578;
        double z = -890745.6;
        float t = -23.43f;

        x = myResult.abs(x);
        y = myResult.abs(y);
        z = myResult.abs(z);
        t = myResult.abs(t);
    }
}

class myResult {
    public static int abs(int num) {
        return num < 0 ? -num : num;
    }

    public static long abs(long num) {
        return num < 0 ? -num : num;
    }

    public static double abs(double num) {
        return num < 0 ? -num : num;
    }

    public static float abs(float num) {
        return num < 0 ? -num : num;
    }
}
