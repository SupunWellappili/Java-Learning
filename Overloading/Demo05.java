package Overloading;

public class Demo05 {
    public static void main(String args[]) {
        myClass001.myFirstMethod001();
        myClass001.mySecondMethod002(200);
    }
}

 class myClass001 {
    public static int myFirstMethod001() {
        System.out.println("result-01 ");
        return 100;
    }

    public static void mySecondMethod002(int codes) { //illegal
        System.out.println("result-02 "+codes);
        return;
    }
}


