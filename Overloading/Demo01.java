package Overloading;

public class Demo01 {
    public static void main(String[] args) {
        int x = -12123;
        long y = -234;
        float f = -0.34443f;
        double d = -12.3434;

        x = myClass.abs(x);
        y = myClass.abs(y);
        f = myClass.abs(f);
        d = myClass.abs(d);
    }
}

 class myClass{
    public static int abs(int x) {
        return x < 0 ? -x : x;
    }

    public static long abs(long y){
        return y<0 ? -y : y;
    }


    public static float abs(float f){
        return f<0 ? -f : f;
    }

    public static double abs(double d){
        return d<0 ? -d : d;
    }
}

//Method overloading