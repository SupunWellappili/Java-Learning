package Overloading;

public class Demo05 {
    public static void main(String args[]) {
        myClass001.myFristMethod001();
        myClass001.mySecoundMethod002(200);
    }
}

 class myClass001 {
    public static int myFristMethod001() {
        System.out.println("result-01 ");
        return 100;
    }

    public static void mySecoundMethod002(int codes) { //illegal
        System.out.println("result-02 "+codes);
        return;
    }
}


