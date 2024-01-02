package  Overloading;

public class Demo04 {
    public static void main(String args[]) {
        myClass01.myFristMethod(100);
        myClass01.mySecoundMethod(100.0,34);
    }
}

class myClass01 {
    public static void myFristMethod(int x) {
        System.out.println("1st Int----> "+x);
        return;
    }

    public static void mySecoundMethod(double x,int y) {
        System.out.println("2nd Double----> "+x+" "+y);
        return;
    }
}
