package Activities;

public class Demo07 {

    public static int increment(int x) {
        return ++x;
    }

    public static void main(String args[]) {
        int x = 100;
        System.out.println("main x :" + x); //x=100
        increment(x);
        System.out.println("main x :" + x);//x=100
        x = increment(x);
        System.out.println("Main X : " + x);//101
    }

}
